package com.mods.BlockGravity.util;
import com.mods.BlockGravity.BlockGravity;
import com.mods.BlockGravity.blocks.BlockItemBase;
import com.mods.BlockGravity.items.ItemBase;
import net.minecraft.block.Block;
import com.mods.BlockGravity.blocks.RubyBlock;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,BlockGravity.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS,BlockGravity.MOD_ID);

    public static void init(){

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());



    }

    //ITEMS
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    //BLOCKS

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",RubyBlock::new);

    //BLOCK
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",() -> new BlockItemBase(RUBY_BLOCK.get()));
}
