package com.compressedblocks.mod.init;

import com.compressedblocks.mod.blocks.*;
import com.compressedblocks.mod.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
   public static final BlockCB CompDiamondBlock = new CompressedDiamondBlock();
   public static final BlockCB DoubleCompDiamondBlock = new DoubleCompressedDiamondBlock();
    public static final BlockCB TripleCompDiamondBlock = new TripleCompressedDiamondBlock();
    public static final BlockCB QuadrupleCompDiamondBlock = new QuadrupleCompressedDiamondBlock();
    public static final BlockCB QuintupleCompDiamondBlock = new QuintupleCompressedDiamondBlock();
    public static final BlockCB SextupleCompDiamondBlock = new SextupleCompressedDiamondBlock();
    public static final BlockCB SeptupleCompDiamondBlock = new SeptupleCompressedDiamondBlock();
    public static final BlockCB OctupleCompDiamondBlock = new OctupleCompressedDiamondBlock();

    public static final BlockCB CompIronBlock = new CompressedIronBlock();
    public static final BlockCB DoubleCompIronBlock = new DoubleCompressedIronBlock();
    public static final BlockCB TripleCompIronBlock = new TripleCompressedIronBlock();
    public static final BlockCB QuadrupleCompIronBlock = new QuadrupleCompressedIronBlock();
    public static final BlockCB QuintupleCompIronBlock = new QuintupleCompressedIronBlock();
    public static final BlockCB SextupleCompIronBlock = new SextupleCompressedIronBlock();
    public static final BlockCB SeptupleCompIronBlock = new SeptupleCompressedIronBlock();
    public static final BlockCB OctupleCompIronBlock = new OctupleCompressedIronBlock();






    public static void init()
    {
        GameRegistry.registerBlock(CompDiamondBlock, ItemBlockCompDiamondBlock.class, "Compressed Diamond Block");
        GameRegistry.registerBlock(DoubleCompDiamondBlock, ItemBlockDoubleCompDiamondBlock.class, "Double Compressed Diamond Block");
        GameRegistry.registerBlock(TripleCompDiamondBlock, ItemBlockTripleCompDiamondBlock.class, "Triple Compressed Diamond Block");
        GameRegistry.registerBlock(QuadrupleCompDiamondBlock, ItemBlockQuadrupleCompDiamondBlock.class, "Quadruple Compressed Diamond Block");
        GameRegistry.registerBlock(QuintupleCompDiamondBlock, ItemBlockQuintupleCompDiamondBlock.class, "Quintuple Compressed Diamond Block");
        GameRegistry.registerBlock(SextupleCompDiamondBlock, ItemBlockSextupleCompDiamondBlock.class, "Sextuple Compressed Diamond Block");
        GameRegistry.registerBlock(SeptupleCompDiamondBlock, ItemBlockSeptupleCompDiamondBlock.class, "Septuple Compressed Diamond Block");
        GameRegistry.registerBlock(OctupleCompDiamondBlock, ItemBlockOctupleCompDiamondBlock.class, "Octuple Compressed Diamond Block");

        GameRegistry.registerBlock(CompIronBlock, ItemBlockCompIronBlock.class, "Compressed Iron Block");
        GameRegistry.registerBlock(DoubleCompIronBlock, ItemBlockDoubleCompIronBlock.class, "Double Compressed Iron Block");
        GameRegistry.registerBlock(TripleCompIronBlock, ItemBlockTripleCompIronBlock.class, "Triple Compressed Iron Block");
        GameRegistry.registerBlock(QuadrupleCompIronBlock, ItemBlockQuadrupleCompIronBlock.class, "Quadruple Compressed Iron Block");
        GameRegistry.registerBlock(QuintupleCompIronBlock, ItemBlockQuintupleCompIronBlock.class, "Quintuple Compressed Iron Block");
        GameRegistry.registerBlock(SextupleCompIronBlock, ItemBlockSextupleCompIronBlock.class, "Sextuple Compressed Iron Block");
        GameRegistry.registerBlock(SeptupleCompIronBlock, ItemBlockSeptupleCompIronBlock.class, "Septuple Compressed Iron Block");
        GameRegistry.registerBlock(OctupleCompIronBlock, ItemBlockOctupleCompIronBlock.class, "Octuple Compressed Iron Block");








    }


}
