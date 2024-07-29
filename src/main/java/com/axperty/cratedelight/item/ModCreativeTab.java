package com.axperty.cratedelight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.axperty.cratedelight.CrateDelight;
import com.axperty.cratedelight.registry.BlockRegistry;

public class ModCreativeTab {
    public static final ItemGroup CRATEDELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(CrateDelight.MODID + ":" + "cratedelight_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.cratedelight"))
                    .icon(() -> new ItemStack(BlockRegistry.BERRY_CRATE))
                    .entries((displayContext, entries) -> {

                        if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                            entries.add(BlockRegistry.CARROT_CRATE);
                            entries.add(BlockRegistry.POTATO_CRATE);
                            entries.add(BlockRegistry.BEETROOT_CRATE);
                        }

                        entries.add(BlockRegistry.APPLE_CRATE);
                        entries.add(BlockRegistry.BERRY_CRATE);

                        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
                            entries.add(BlockRegistry.BLUEBERRY_CRATE);
                        }

                        entries.add(BlockRegistry.GLOWBERRY_CRATE);
                        entries.add(BlockRegistry.EGG_CRATE);

                        if (FabricLoader.getInstance().isModLoaded("naturalist")) {
                            entries.add(BlockRegistry.DUCK_EGG_CRATE);
                        }

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                            entries.add(BlockRegistry.PEANUT_CRATE);
                        }

                        if (FabricLoader.getInstance().isModLoaded("jagmkiwis")) {
                            entries.add(BlockRegistry.KIWI_EGG_CRATE);
                            entries.add(BlockRegistry.KIWIFRUIT_CRATE);
                        }

                        entries.add(BlockRegistry.SALMON_CRATE);
                        entries.add(BlockRegistry.COD_CRATE);

                        if (FabricLoader.getInstance().isModLoaded("naturalist")) {
                            entries.add(BlockRegistry.CATFISH_CRATE);
                            entries.add(BlockRegistry.BASS_CRATE);
                        }

                        if (FabricLoader.getInstance().isModLoaded("betterend")) {
                            entries.add(BlockRegistry.END_FISH_CRATE);
                        }

                        entries.add(BlockRegistry.RED_MUSHROOM_CRATE);
                        entries.add(BlockRegistry.BROWN_MUSHROOM_CRATE);
                        entries.add(BlockRegistry.GOLDEN_CARROT_CRATE);
                        entries.add(BlockRegistry.GOLDEN_APPLE_CRATE);
                        entries.add(BlockRegistry.COCOABEANS_BAG);
                        entries.add(BlockRegistry.SUGAR_BAG);
                        entries.add(BlockRegistry.GUNPOWDER_BAG);

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                            entries.add(BlockRegistry.SALT_BAG);
                            entries.add(BlockRegistry.GROUND_CINNAMON_BAG);
                        }

                        if (FabricLoader.getInstance().isModLoaded("create")) {
                            entries.add(BlockRegistry.WHEAT_FLOUR_BAG);
                            entries.add(BlockRegistry.POWDERED_OBSIDIAN_BAG);
                            entries.add(BlockRegistry.CINDER_FLOUR_BAG);
                        }

                        if (FabricLoader.getInstance().isModLoaded("betterend")) {
                            entries.add(BlockRegistry.ENDER_DUST_BAG);
                        }
                    })
                    .build());

    public static void registerItemGroups() {
        CrateDelight.LOGGER.info("Registering Item Groups for " + CrateDelight.MODID);
    }
}