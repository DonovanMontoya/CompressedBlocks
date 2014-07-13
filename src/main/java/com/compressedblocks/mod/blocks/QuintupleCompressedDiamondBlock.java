package com.compressedblocks.mod.blocks;

import com.compressedblocks.mod.creativetab.CreativeTabCompressedBlocks;
import net.minecraft.world.IBlockAccess;

public class QuintupleCompressedDiamondBlock extends BlockCB
{

        public QuintupleCompressedDiamondBlock()
        {
            super();
            this.setBlockName("QuintupleCompDiamondBlock");
            this.setStepSound(soundTypeMetal);
            this.setBlockTextureName("QuintupleCompDiamondBlock");
            this.setHardness(10.0F);
            this.setResistance(60.0f);
            this.setHarvestLevel("pickaxe", 3);
        }


        @Override
        public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }
    }
