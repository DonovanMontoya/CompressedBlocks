package com.compressedblocks.mod;

import com.compressedblocks.mod.blocks.CompressedDiamondBlock;
import com.compressedblocks.mod.handler.ConfigurationHandler;
import com.compressedblocks.mod.init.ModBlocks;
import com.compressedblocks.mod.proxy.IProxy;
import com.compressedblocks.mod.reference.Reference;
import com.compressedblocks.mod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class CompressedBlocks {
    @Mod.Instance(Reference.MOD_ID)
    public static CompressedBlocks instance;

    @SidedProxy(clientSide = Reference.CLIANT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre-Initialization Complete!");

        ModBlocks.init();


        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompDiamondBlock), "xxx", "xxx", "xxx", 'x', Blocks.diamond_block);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DoubleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.CompDiamondBlock);

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block, 9), new Object[]{ModBlocks.CompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompDiamondBlock, 9), new Object[]{ModBlocks.DoubleCompDiamondBlock});


    }
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Initialization Complete!");
    }
}
