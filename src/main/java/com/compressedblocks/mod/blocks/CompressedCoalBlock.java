package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class CompressedCoalBlock extends BlockCB
{
//TODO Make into Fuel
    public CompressedCoalBlock()
    {
        super();
        this.setBlockName("CompCoalBlock");
        this.setStepSound(soundTypeStone);
        this.setBlockTextureName("CompressedCoalBlock");
        this.setHardness(6.0F);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 3);
    }
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}


