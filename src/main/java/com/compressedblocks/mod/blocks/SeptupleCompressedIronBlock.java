package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class SeptupleCompressedIronBlock extends BlockCB
{

    public SeptupleCompressedIronBlock()
    {
        super();
        this.setBlockName("SeptupleCompIronBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("SeptupleCompIronBlock");
        this.setHardness(60.0F);
        this.setResistance(180.0f);
        this.setHarvestLevel("pickaxe", 3);
    }


    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}
