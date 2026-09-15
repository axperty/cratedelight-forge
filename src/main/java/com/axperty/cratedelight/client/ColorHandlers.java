package com.axperty.cratedelight.client;

import com.axperty.cratedelight.CrateDelight;
import com.axperty.cratedelight.registry.BlockRegistry;
import net.minecraft.client.color.block.BlockTintSources;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import java.util.List;

@EventBusSubscriber(modid = CrateDelight.MODID, value = Dist.CLIENT)
public class ColorHandlers {

    // Foliage Colors from Minecraft class
    public static final int FOLIAGE_EVERGREEN = -10380959;
    public static final int FOLIAGE_BIRCH = -8345771;
    // public static final int FOLIAGE_DEFAULT = -12012264;

    // This one doesn't match with the mangrove leaves color for some reason
    // public static final int FOLIAGE_MANGROVE = -7158200;

    @SubscribeEvent
    public static void registerBlockTints(RegisterColorHandlersEvent.BlockTintSources event) {
    }
}
