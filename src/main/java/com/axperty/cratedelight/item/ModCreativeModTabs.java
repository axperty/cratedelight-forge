package com.axperty.cratedelight.item;

import com.axperty.cratedelight.block.ModBlocks;
import com.axperty.cratedelight.CrateDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrateDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRATEDELIGHT_TAB = CREATIVE_MODE_TABS.register("cratedelight_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BERRY_CRATE.get()))
                    .title(Component.translatable("creativetab.cratedelight_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.APPLE_CRATE.get());
                        pOutput.accept(ModBlocks.BERRY_CRATE.get());
                        pOutput.accept(ModBlocks.GLOWBERRY_CRATE.get());
                        pOutput.accept(ModBlocks.EGG_CRATE.get());
                        pOutput.accept(ModBlocks.SALMON_CRATE.get());
                        pOutput.accept(ModBlocks.COD_CRATE.get());
                        pOutput.accept(ModBlocks.GOLDEN_APPLE_CRATE.get());
                        pOutput.accept(ModBlocks.COCOABEANS_BAG.get());
                        pOutput.accept(ModBlocks.SUGAR_BAG.get());
                        pOutput.accept(ModBlocks.GUNPOWDER_BAG.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
