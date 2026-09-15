package com.axperty.cratedelight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.axperty.cratedelight.CrateDelight.MODID;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRATEDELIGHT_TAB = CREATIVE_MODE_TABS.register("cratedelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.cratedelight"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.BERRY_CRATE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                if (!ModList.get().isLoaded("farmersdelight")) {
                    output.accept(BlockRegistry.CARROT_CRATE.get());
                    output.accept(BlockRegistry.BEETROOT_CRATE.get());
                    output.accept(BlockRegistry.POTATO_CRATE.get());
                }

                output.accept(BlockRegistry.POISONOUS_POTATO_CRATE.get());

                output.accept(BlockRegistry.APPLE_CRATE.get());
                output.accept(BlockRegistry.BERRY_CRATE.get());
                output.accept(BlockRegistry.GLOWBERRY_CRATE.get());
                output.accept(BlockRegistry.EGG_CRATE.get());
                output.accept(BlockRegistry.BROWN_EGG_CRATE.get());
                output.accept(BlockRegistry.BLUE_EGG_CRATE.get());
                output.accept(BlockRegistry.SALMON_CRATE.get());
                output.accept(BlockRegistry.COD_CRATE.get());
                output.accept(BlockRegistry.PUFFERFISH_CRATE.get());
                output.accept(BlockRegistry.TROPICAL_FISH_CRATE.get());

                output.accept(BlockRegistry.RED_MUSHROOM_CRATE.get());
                output.accept(BlockRegistry.BROWN_MUSHROOM_CRATE.get());

                if (ModList.get().isLoaded("farmersdelight")) {
                    output.accept(BlockRegistry.PUMPKIN_SLICE_CRATE.get());
                }

                output.accept(BlockRegistry.GOLDEN_CARROT_CRATE.get());
                output.accept(BlockRegistry.GOLDEN_APPLE_CRATE.get());
                output.accept(BlockRegistry.BREAD_BAG);
                output.accept(BlockRegistry.COOKIE_BAG.get());
                output.accept(BlockRegistry.COCOABEANS_BAG.get());
                output.accept(BlockRegistry.SUGAR_BAG.get());
                output.accept(BlockRegistry.GUNPOWDER_BAG.get());
                output.accept(BlockRegistry.LEAF_LITTER_BAG.get());
                output.accept(BlockRegistry.WHEAT_SEEDS_BAG.get());
                output.accept(BlockRegistry.PUMPKIN_SEEDS_BAG.get());
                output.accept(BlockRegistry.MELON_SEEDS_BAG.get());
                output.accept(BlockRegistry.BEETROOT_SEEDS_BAG.get());
            }).build());
}
