package com.axperty.cratedelight;

import com.axperty.cratedelight.item.ModCreativeTab;
import com.axperty.cratedelight.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrateDelight implements ModInitializer {
    public static final String MODID = "cratedelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        LOGGER.debug("[Crate Delight]: Registering blocks...");
        ModCreativeTab.registerItemGroups();
        BlockRegistry.registerModBlocks();
        LOGGER.debug("[Crate Delight]: Blocks registered successfully!");
    }
}
