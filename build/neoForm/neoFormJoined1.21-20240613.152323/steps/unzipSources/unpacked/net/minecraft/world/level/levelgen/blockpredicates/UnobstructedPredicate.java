package net.minecraft.world.level.levelgen.blockpredicates;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.phys.shapes.Shapes;

record UnobstructedPredicate(Vec3i offset) implements BlockPredicate {
    public static MapCodec<UnobstructedPredicate> CODEC = RecordCodecBuilder.mapCodec(
        p_345644_ -> p_345644_.group(Vec3i.CODEC.optionalFieldOf("offset", Vec3i.ZERO).forGetter(UnobstructedPredicate::offset))
                .apply(p_345644_, UnobstructedPredicate::new)
    );

    @Override
    public BlockPredicateType<?> type() {
        return BlockPredicateType.UNOBSTRUCTED;
    }

    public boolean test(WorldGenLevel pLevel, BlockPos pPos) {
        return pLevel.isUnobstructed(null, Shapes.block().move((double)pPos.getX(), (double)pPos.getY(), (double)pPos.getZ()));
    }
}