package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class SextupleCompressedIronBlock extends BlockCB
{
    public SextupleCompressedIronBlock()
    {
        super();
        this.setBlockName("SextupleCompIronBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("SextupleCompIronBlock");
        this.setHardness(80.0F);
        this.setResistance(200.0f);
        this.setHarvestLevel("pickaxe", 3);

    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}


