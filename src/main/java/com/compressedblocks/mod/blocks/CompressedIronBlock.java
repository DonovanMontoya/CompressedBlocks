package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class CompressedIronBlock extends BlockCB
{
    public CompressedIronBlock()
    {
        super();
        this.setBlockName("CompIronBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("CompressedIronBlock");
        this.setHardness(6.0F);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 3);
    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}

