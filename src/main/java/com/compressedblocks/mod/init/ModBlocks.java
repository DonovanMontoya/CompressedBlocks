package com.compressedblocks.mod.init;

import com.compressedblocks.mod.blocks.BlockCB;
import com.compressedblocks.mod.blocks.CompressedDiamondBlock;
import com.compressedblocks.mod.blocks.DoubleCompressedDiamondBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
   public static final BlockCB CompDiamondBlock = new CompressedDiamondBlock();
   public static final BlockCB DoubleCompDiamondBlock = new DoubleCompressedDiamondBlock();
    public static void init()
    {
        GameRegistry.registerBlock(CompDiamondBlock, "Compressed Diamond Block");
        GameRegistry.registerBlock(DoubleCompDiamondBlock, "Double Compressed Diamond Block");
    }

}
