package com.compressedblocks.mod.blocks;

import net.minecraft.creativetab.CreativeTabs;

public class QuadrupleCompressedDiamondBlock extends BlockCB
{
    public QuadrupleCompressedDiamondBlock()
    {
        super();
        this.setBlockName("QuadrupleCompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("QuadrupleCompDiamondBlock");
        this.setHardness(50.0F);
        this.setResistance(150.0f);
        this.setHarvestLevel("pickaxe", 3);

    }

}

