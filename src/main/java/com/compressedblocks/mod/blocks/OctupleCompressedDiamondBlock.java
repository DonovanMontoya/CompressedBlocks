package com.compressedblocks.mod.blocks;

import net.minecraft.world.IBlockAccess;

public class OctupleCompressedDiamondBlock extends BlockCB
{

    public OctupleCompressedDiamondBlock()
    {
        super();
        this.setBlockName("OctupleCompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("OctupleCompDiamondBlock");
        this.setHardness(60.0F);
        this.setResistance(180.0f);
        this.setHarvestLevel("pickaxe", 3);
    }


    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}
