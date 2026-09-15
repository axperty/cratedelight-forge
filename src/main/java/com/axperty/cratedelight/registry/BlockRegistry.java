package com.axperty.cratedelight.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    // Carrot Crate
    public static final DeferredBlock<Block> CARROT_CRATE = BLOCKS.registerBlock("carrot_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Beetroot Crate
    public static final DeferredBlock<Block> BEETROOT_CRATE = BLOCKS.registerBlock("beetroot_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Potato Crate
    public static final DeferredBlock<Block> POTATO_CRATE = BLOCKS.registerBlock("potato_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Poisonous Potato Crate
    public static final DeferredBlock<Block> POISONOUS_POTATO_CRATE = BLOCKS.registerBlock("poisonous_potato_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Apple Crate
    public static final DeferredBlock<Block> APPLE_CRATE = BLOCKS.registerBlock("apple_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Berry Crate
    public static final DeferredBlock<Block> BERRY_CRATE = BLOCKS.registerBlock("berry_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Glow Berry Crate
    public static final DeferredBlock<Block> GLOWBERRY_CRATE = BLOCKS.registerBlock("glowberry_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD).lightLevel((state) -> 13));

    // Egg Crate
    public static final DeferredBlock<Block> EGG_CRATE = BLOCKS.registerBlock("egg_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Brown Egg Crate
    public static final DeferredBlock<Block> BROWN_EGG_CRATE = BLOCKS.registerBlock("brown_egg_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Blue Egg Crate
    public static final DeferredBlock<Block> BLUE_EGG_CRATE = BLOCKS.registerBlock("blue_egg_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Salmon Crate
    public static final DeferredBlock<Block> SALMON_CRATE = BLOCKS.registerBlock("salmon_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Cod Crate
    public static final DeferredBlock<Block> COD_CRATE = BLOCKS.registerBlock("cod_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Pufferfish Crate
    public static final DeferredBlock<Block> PUFFERFISH_CRATE = BLOCKS.registerBlock("pufferfish_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Tropical Fish Crate
    public static final DeferredBlock<Block> TROPICAL_FISH_CRATE = BLOCKS.registerBlock("tropical_fish_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Red Mushroom Crate
    public static final DeferredBlock<Block> RED_MUSHROOM_CRATE = BLOCKS.registerBlock("red_mushroom_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Brown Mushroom Crate
    public static final DeferredBlock<Block> BROWN_MUSHROOM_CRATE = BLOCKS.registerBlock("brown_mushroom_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Pumpkin Slice Crate
    public static final DeferredBlock<Block> PUMPKIN_SLICE_CRATE = BLOCKS.registerBlock("pumpkin_slice_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Golden Carrot Crate
    public static final DeferredBlock<Block> GOLDEN_CARROT_CRATE = BLOCKS.registerBlock("golden_carrot_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Golden Apple Crate
    public static final DeferredBlock<Block> GOLDEN_APPLE_CRATE = BLOCKS.registerBlock("golden_apple_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Bread Bag
    public static final DeferredBlock<Block> BREAD_BAG = BLOCKS.registerBlock("bread_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Cookie Bag
    public static final DeferredBlock<Block> COOKIE_BAG = BLOCKS.registerBlock("cookie_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Cocoa Beans Bag
    public static final DeferredBlock<Block> COCOABEANS_BAG = BLOCKS.registerBlock("cocoabeans_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Sugar Bag
    public static final DeferredBlock<Block> SUGAR_BAG = BLOCKS.registerBlock("sugar_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Gunpowder Bag
    public static final DeferredBlock<Block> GUNPOWDER_BAG = BLOCKS.registerBlock("gunpowder_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Leaf Litter Bag
    public static final DeferredBlock<Block> LEAF_LITTER_BAG = BLOCKS.registerBlock("leaf_litter_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Wheat Seeds Bag
    public static final DeferredBlock<Block> WHEAT_SEEDS_BAG = BLOCKS.registerBlock("wheat_seeds_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Pumpkin Seeds Bag
    public static final DeferredBlock<Block> PUMPKIN_SEEDS_BAG = BLOCKS.registerBlock("pumpkin_seeds_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Melon Seeds Bag
    public static final DeferredBlock<Block> MELON_SEEDS_BAG = BLOCKS.registerBlock("melon_seeds_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));

    // Beetroot Seeds Bag
    public static final DeferredBlock<Block> BEETROOT_SEEDS_BAG = BLOCKS.registerBlock("beetroot_seeds_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WOOL.white()).mapColor(MapColor.WOOL));
}