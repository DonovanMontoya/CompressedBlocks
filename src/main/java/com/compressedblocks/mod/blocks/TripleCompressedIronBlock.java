package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class TripleCompressedIronBlock extends BlockCB
{
    public TripleCompressedIronBlock()
    {
        super();
        this.setBlockName("TripleCompIronBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("TripleCompressedIronBlock");
        this.setHardness(30.0F);
        this.setResistance(100.0f);
        this.setHarvestLevel("pickaxe", 3);
    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}

