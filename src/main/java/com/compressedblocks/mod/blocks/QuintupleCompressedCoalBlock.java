package com.compressedblocks.mod.blocks;

import com.compressedblocks.mod.creativetab.CreativeTabCompressedBlocks;
import net.minecraft.world.IBlockAccess;

public class QuintupleCompressedCoalBlock extends BlockCB
{

    public QuintupleCompressedCoalBlock()
    {
        super();
        this.setBlockName("QuintupleCompCoalBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("QuintupleCompCoalBlock");
        this.setHardness(50.0F);
        this.setResistance(150.0f);
        this.setHarvestLevel("pickaxe", 3);
    }


    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}
