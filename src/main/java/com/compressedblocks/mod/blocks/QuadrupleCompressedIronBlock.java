package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class QuadrupleCompressedIronBlock extends BlockCB
{
    public QuadrupleCompressedIronBlock()
    {
        super();
        this.setBlockName("QuadrupleCompIronBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("QuadrupleCompressedIronBlock");
        this.setHardness(50.0F);
        this.setResistance(150.0f);
        this.setHarvestLevel("pickaxe", 3);
    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}

