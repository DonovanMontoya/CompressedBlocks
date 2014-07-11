package com.compressedblocks.mod.init;

import com.compressedblocks.mod.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
   public static final BlockCB CompDiamondBlock = new CompressedDiamondBlock();
   public static final BlockCB DoubleCompDiamondBlock = new DoubleCompressedDiamondBlock();
    public static final BlockCB TripleCompDiamondBlock = new TripleCompressedDiamondBlock();
    public static final BlockCB QuadrupleCompDiamondBlock = new QuadrupleCompressedDiamondBlock();
    public static void init()
    {
        GameRegistry.registerBlock(CompDiamondBlock, "Compressed Diamond Block");
        GameRegistry.registerBlock(DoubleCompDiamondBlock, "Double Compressed Diamond Block");
        GameRegistry.registerBlock(TripleCompDiamondBlock, "Triple Compressed Diamond Block");
        GameRegistry.registerBlock(QuadrupleCompDiamondBlock, "Quadruple Compressed Diamond Block");
    }

}
