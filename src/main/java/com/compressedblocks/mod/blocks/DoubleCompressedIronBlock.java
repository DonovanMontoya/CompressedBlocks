package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class DoubleCompressedIronBlock extends BlockCB
{
    public DoubleCompressedIronBlock()
    {
        super();
        this.setBlockName("DoubleCompIronBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("DoubleCompressedIronBlock");
        this.setHardness(10.0F);
        this.setResistance(60.0f);
        this.setHarvestLevel("pickaxe", 3);
    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}

