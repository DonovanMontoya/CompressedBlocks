package com.compressedblocks.mod.blocks;

import net.minecraft.creativetab.CreativeTabs;

public class CompressedDiamondBlock extends BlockCB
{
    public CompressedDiamondBlock()
    {
        super();
        this.setBlockName("CompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("CompressedDiamondBlock");
        this.setHardness(6.0F);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 3);
    }

}
