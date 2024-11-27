package com.poolinablock;

import com.poolinablock.pool_in_a_block_mod.Items;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main_Mod_File.MOD_ID)
public class Main_Mod_File {

    public static final String MOD_ID = "pool_in_a_block";

    public Main_Mod_File() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Replace Items with the class name to register a class
        Items.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if event,getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(Items.FLUID_GENERATOR);
            }
        }
    }
}
