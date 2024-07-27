package net.minecraft.world.item.enchantment.effects;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.LevelBasedValue;
import net.minecraft.world.phys.Vec3;

public record DamageItem(LevelBasedValue amount) implements EnchantmentEntityEffect {
    public static final MapCodec<DamageItem> CODEC = RecordCodecBuilder.mapCodec(
        p_345307_ -> p_345307_.group(LevelBasedValue.CODEC.fieldOf("amount").forGetter(p_346038_ -> p_346038_.amount)).apply(p_345307_, DamageItem::new)
    );

    @Override
    public void apply(ServerLevel pLevel, int pEnchantmentLevel, EnchantedItemInUse pItem, Entity pEntity, Vec3 pOrigin) {
        ServerPlayer serverplayer = pItem.owner() instanceof ServerPlayer serverplayer1 ? serverplayer1 : null;
        pItem.itemStack().hurtAndBreak((int)this.amount.calculate(pEnchantmentLevel), pLevel, serverplayer, pItem.onBreak());
    }

    @Override
    public MapCodec<DamageItem> codec() {
        return CODEC;
    }
}
