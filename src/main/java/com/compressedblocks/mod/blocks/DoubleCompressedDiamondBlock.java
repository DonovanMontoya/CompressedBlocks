package com.compressedblocks.mod.blocks;

import com.compressedblocks.mod.creativetab.CreativeTabCompressedBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.IBlockAccess;

public class DoubleCompressedDiamondBlock extends BlockCB
{
    public DoubleCompressedDiamondBlock()
    {
        super();
        this.setBlockName("DoubleCompDiamondBlock");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("DoubleCompDiamondBlock");
        this.setHardness(10.0F);
        this.setResistance(60.0f);
        this.setHarvestLevel("pickaxe", 3);
    }


    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}
