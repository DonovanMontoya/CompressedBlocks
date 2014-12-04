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

//GameRegistry.registerFuelHandler(new FuelHandler());

        //Diamond
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompDiamondBlock), "xxx", "xxx", "xxx", 'x', Blocks.diamond_block);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DoubleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.CompDiamondBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.TripleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.DoubleCompDiamondBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.QuadrupleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.TripleCompDiamondBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.QuintupleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.QuadrupleCompDiamondBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SextupleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.QuintupleCompDiamondBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SeptupleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.SextupleCompDiamondBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.OctupleCompDiamondBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.SeptupleCompDiamondBlock);


        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block, 9), new Object[]{ModBlocks.CompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompDiamondBlock, 9), new Object[]{ModBlocks.DoubleCompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DoubleCompDiamondBlock, 9), new Object[]{ModBlocks.TripleCompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TripleCompDiamondBlock, 9), new Object[]{ModBlocks.QuadrupleCompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.QuadrupleCompDiamondBlock, 9), new Object[]{ModBlocks.QuintupleCompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.QuintupleCompDiamondBlock, 9), new Object[]{ModBlocks.SextupleCompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SextupleCompDiamondBlock, 9), new Object[]{ModBlocks.SeptupleCompDiamondBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SeptupleCompDiamondBlock, 9), new Object[]{ModBlocks.OctupleCompDiamondBlock});

        //Iron
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompIronBlock), "xxx", "xxx", "xxx", 'x', Blocks.iron_block);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DoubleCompIronBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.CompIronBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.TripleCompIronBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.DoubleCompIronBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.QuadrupleCompIronBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.TripleCompIronBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.QuintupleCompIronBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.QuadrupleCompIronBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SextupleCompIronBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.QuintupleCompIronBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SeptupleCompIronBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.SextupleCompIronBlock);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.OctupleCompIronBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.SeptupleCompIronBlock);


        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.iron_block, 9), new Object[]{ModBlocks.CompIronBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompIronBlock, 9), new Object[]{ModBlocks.DoubleCompIronBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DoubleCompIronBlock, 9), new Object[]{ModBlocks.TripleCompIronBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TripleCompIronBlock, 9), new Object[]{ModBlocks.QuadrupleCompIronBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.QuadrupleCompIronBlock, 9), new Object[]{ModBlocks.QuintupleCompIronBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.QuintupleCompIronBlock, 9), new Object[]{ModBlocks.SextupleCompIronBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SextupleCompIronBlock, 9), new Object[]{ModBlocks.SeptupleCompIronBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SeptupleCompIronBlock, 9), new Object[]{ModBlocks.OctupleCompIronBlock});


        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompCoalBlock), "xxx", "xxx", "xxx", 'x', Blocks.coal_block);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DoubleCompCoalBlock), "xxx", "xxx", "xxx", 'x', ModBlocks.CompCoalBlock);



        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.coal_block, 9), new Object[]{ModBlocks.CompCoalBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompCoalBlock, 9), new Object[]{ModBlocks.DoubleCompCoalBlock});












    }
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }


    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Initialization Complete!");
    }
}
