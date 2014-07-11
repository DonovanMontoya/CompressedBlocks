package com.compressedblocks.mod.blocks;

import net.minecraft.creativetab.CreativeTabs;

public class DoubleCompressedDiamondBlock extends BlockCB
{
    public DoubleCompressedDiamondBlock()
    {
        super();
        this.setBlockName("DoubleCompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("DoubleCompDiamondBlock");
        this.setHardness(10.0F);
        this.setResistance(60.0f);
        this.setHarvestLevel("pickaxe", 3);

    }

}
