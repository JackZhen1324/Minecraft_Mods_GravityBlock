package com.mods.BlockGravity;

import com.mods.BlockGravity.blocks.BlockInit;
import com.mods.BlockGravity.util.blockConfig;
import com.mods.Blockexplosion.util.explosionConfig;

import com.mods.BlockGravity.ModBlockColors;
import com.mods.BlockGravity.util.RegistryHandler;
import com.mods.BlockGravity.util.configHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.mods.BlockGravity.util.configHandler;

import java.io.File;
import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("blockgravity")
public class BlockGravity
{


    public static File config;
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "blockgravity";
    public BlockGravity() {


        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
     /*   // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading*/
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,configHandler.CONFIG_SPEC,"gravityblock-commom.toml");



        // Register ourselves for server and other game events we  are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        blockConfig.setIsGravityOn(configHandler.COMMON.enableGravity.get());
        blockConfig.setRange(configHandler.COMMON.gravityRange.get());
        blockConfig.setRealisticLevel(configHandler.COMMON.RealisticLevel.get());
        explosionConfig.setRange(configHandler.COMMON.explosionRange.get());

        System.out.println("load from blockConfig:");
        System.out.println(configHandler.COMMON.enableGravity.get());
        System.out.println(configHandler.COMMON.gravityRange.get());
        System.out.println((configHandler.COMMON.RealisticLevel.get()));
        // some preinit code



    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        System.out.println("finishing setting uo render!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        RenderTypeLookup.setRenderLayer(BlockInit.falling_oak_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.falling_spruce_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.falling_birch_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.falling_acacia_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.falling_jungle_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.falling_dark_oak_leaves, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.falling_grass_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.RUBY_BLOCK.get(), RenderType.getCutout());
        // do something that can only be done on the client
        System.out.print("finsih block coloring!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        ModBlockColors.registerBlockColourHandlers();

    }

/*    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }*/
  /*  // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }*/
}
