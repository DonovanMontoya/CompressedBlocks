package com.compressedblocks.mod.blocks;

import net.minecraft.creativetab.CreativeTabs;

public class TripleCompressedDiamondBlock extends BlockCB
{
    public TripleCompressedDiamondBlock()
    {
        super();
        this.setBlockName("TripleCompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName("TripleCompDiamondBlock");
        this.setHardness(30.0F);
        this.setResistance(100.0f);
        this.setHarvestLevel("pickaxe", 3);

    }

}

