package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class SeptupleCompressedDiamondBlock extends BlockCB
{

    public SeptupleCompressedDiamondBlock()
    {
        super();
        this.setBlockName("SeptupleCompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("SeptupleCompDiamondBlock");
        this.setHardness(60.0F);
        this.setResistance(180.0f);
        this.setHarvestLevel("pickaxe", 3);
    }


    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}
