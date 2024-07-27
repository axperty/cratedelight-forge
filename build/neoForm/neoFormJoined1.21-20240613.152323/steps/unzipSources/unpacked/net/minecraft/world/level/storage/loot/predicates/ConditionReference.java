package net.minecraft.world.level.storage.loot.predicates;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.ValidationContext;
import org.slf4j.Logger;

/**
 * A LootItemCondition that refers to another LootItemCondition by its ID.
 */
public record ConditionReference(ResourceKey<LootItemCondition> name) implements LootItemCondition {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final MapCodec<ConditionReference> CODEC = RecordCodecBuilder.mapCodec(
        p_335367_ -> p_335367_.group(ResourceKey.codec(Registries.PREDICATE).fieldOf("name").forGetter(ConditionReference::name))
                .apply(p_335367_, ConditionReference::new)
    );

    @Override
    public LootItemConditionType getType() {
        return LootItemConditions.REFERENCE;
    }

    /**
     * Validate that this object is used correctly according to the given ValidationContext.
     */
    @Override
    public void validate(ValidationContext pContext) {
        if (!pContext.allowsReferences()) {
            pContext.reportProblem("Uses reference to " + this.name.location() + ", but references are not allowed");
        } else if (pContext.hasVisitedElement(this.name)) {
            pContext.reportProblem("Condition " + this.name.location() + " is recursively called");
        } else {
            LootItemCondition.super.validate(pContext);
            pContext.resolver()
                .get(Registries.PREDICATE, this.name)
                .ifPresentOrElse(
                    p_339583_ -> p_339583_.value().validate(pContext.enterElement(".{" + this.name.location() + "}", this.name)),
                    () -> pContext.reportProblem("Unknown condition table called " + this.name.location())
                );
        }
    }

    public boolean test(LootContext pContext) {
        LootItemCondition lootitemcondition = pContext.getResolver().get(Registries.PREDICATE, this.name).map(Holder.Reference::value).orElse(null);
        if (lootitemcondition == null) {
            LOGGER.warn("Tried using unknown condition table called {}", this.name.location());
            return false;
        } else {
            LootContext.VisitedEntry<?> visitedentry = LootContext.createVisitedEntry(lootitemcondition);
            if (pContext.pushVisitedElement(visitedentry)) {
                boolean flag;
                try {
                    flag = lootitemcondition.test(pContext);
                } finally {
                    pContext.popVisitedElement(visitedentry);
                }

                return flag;
            } else {
                LOGGER.warn("Detected infinite loop in loot tables");
                return false;
            }
        }
    }

    public static LootItemCondition.Builder conditionReference(ResourceKey<LootItemCondition> pName) {
        return () -> new ConditionReference(pName);
    }
}