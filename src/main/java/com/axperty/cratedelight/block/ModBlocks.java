package com.axperty.cratedelight.block;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrateDelight.MOD_ID);

    // Carrot Crate
    public static final RegistryObject<Block> CARROT_CRATE = BLOCKS.register("carrot_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Potato Crate
    public static final RegistryObject<Block> POTATO_CRATE = BLOCKS.register("potato_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Beetroot Crate
    public static final RegistryObject<Block> BEETROOT_CRATE = BLOCKS.register("beetroot_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Apple Crate
    public static final RegistryObject<Block> APPLE_CRATE = BLOCKS.register("apple_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Berry Crate
    public static final RegistryObject<Block> BERRY_CRATE = BLOCKS.register("berry_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Blueberry Crate
    public static final RegistryObject<Block> BLUEBERRY_CRATE = BLOCKS.register("blueberry_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Glow Berry Crate
    public static final RegistryObject<Block> GLOWBERRY_CRATE = BLOCKS.register("glowberry_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD).lightLevel((state) -> 13)));

    // Egg Crate
    public static final RegistryObject<Block> EGG_CRATE = BLOCKS.register("egg_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Duck Egg Crate (Naturalist)
    public static final RegistryObject<Block> DUCK_EGG_CRATE = BLOCKS.register("duck_egg_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Emu Egg Crate (Alex's Mobs)
    public static final RegistryObject<Block> EMU_EGG_CRATE = BLOCKS.register("emu_egg_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Terrapin Egg Crate (Alex's Mobs)
    public static final RegistryObject<Block> TERRAPIN_EGG_CRATE = BLOCKS.register("terrapin_egg_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Crocodile Egg Crate (Alex's Mobs)
    public static final RegistryObject<Block> CROCODILE_EGG_CRATE = BLOCKS.register("crocodile_egg_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Banana Crate (Alex's Mobs)
    public static final RegistryObject<Block> BANANA_CRATE = BLOCKS.register("banana_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Salmon Crate
    public static final RegistryObject<Block> SALMON_CRATE = BLOCKS.register("salmon_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Cod Crate
    public static final RegistryObject<Block> COD_CRATE = BLOCKS.register("cod_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Bass Crate (Naturalist)
    public static final RegistryObject<Block> BASS_CRATE = BLOCKS.register("bass_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Catfish Crate (Naturalist)
    public static final RegistryObject<Block> CATFISH_CRATE = BLOCKS.register("catfish_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Red Mushroom Crate
    public static final RegistryObject<Block> RED_MUSHROOM_CRATE = BLOCKS.register("red_mushroom_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Cod Crate
    public static final RegistryObject<Block> BROWN_MUSHROOM_CRATE = BLOCKS.register("brown_mushroom_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Golden Carrot Crate
    public static final RegistryObject<Block> GOLDEN_CARROT_CRATE = BLOCKS.register("golden_carrot_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Golden Apple Crate
    public static final RegistryObject<Block> GOLDEN_APPLE_CRATE = BLOCKS.register("golden_apple_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    // Cocoa Beans Bag
    public static final RegistryObject<Block> COCOABEANS_BAG = BLOCKS.register("cocoabeans_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)));


    // Sugar Bag
    public static final RegistryObject<Block> SUGAR_BAG = BLOCKS.register("sugar_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)));

    // Gunpowder Bag
    public static final RegistryObject<Block> GUNPOWDER_BAG = BLOCKS.register("gunpowder_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)));

    // Wheat Flour Bag (Create)
    public static final RegistryObject<Block> WHEAT_FLOUR_BAG = BLOCKS.register("wheat_flour_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)));

    // Powdered Obsidian Bag (Create)
    public static final RegistryObject<Block> POWDERED_OBSIDIAN_BAG = BLOCKS.register("powdered_obsidian_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)));

    // Cinder Flour Bag (Create)
    public static final RegistryObject<Block> CINDER_FLOUR_BAG = BLOCKS.register("cinder_flour_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)));
}
