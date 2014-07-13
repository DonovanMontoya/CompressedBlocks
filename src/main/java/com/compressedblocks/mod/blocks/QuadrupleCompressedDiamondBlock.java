package com.compressedblocks.mod.blocks;

import com.compressedblocks.mod.creativetab.CreativeTabCompressedBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class QuadrupleCompressedDiamondBlock extends BlockCB
{
    public QuadrupleCompressedDiamondBlock()
    {
        super();
        this.setBlockName("QuadrupleCompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("QuadrupleCompDiamondBlock");
        this.setHardness(50.0F);
        this.setResistance(150.0f);
        this.setHarvestLevel("pickaxe", 3);
    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}
