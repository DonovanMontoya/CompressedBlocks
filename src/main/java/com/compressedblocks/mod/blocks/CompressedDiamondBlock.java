package com.compressedblocks.mod.blocks;

import com.compressedblocks.mod.creativetab.CreativeTabCompressedBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class CompressedDiamondBlock extends BlockCB
{
    public CompressedDiamondBlock()
{
    super();
    this.setBlockName("CompDiamondBlock");
    this.setStepSound(soundTypeMetal);
    this.setBlockTextureName("CompressedDiamondBlock");
    this.setHardness(6.0F);
    this.setResistance(20.0f);
    this.setHarvestLevel("pickaxe", 3);
}
    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
}