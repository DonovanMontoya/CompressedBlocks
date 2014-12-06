package com.compressedblocks.mod.handler;

import com.compressedblocks.mod.CompressedBlocks;
import com.compressedblocks.mod.init.ModBlocks;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler
{


    @Override
    public int getBurnTime(ItemStack fuel) {


        if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.CompCoalBlock)){
            return 129600;
        }
        if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.DoubleCompCoalBlock)){
            return 1166400;
        }
        if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.TripleCompCoalBlock)){
            return 10497600;
        }
        if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.QuadrupleCompCoalBlock)) {
            return 94478400;
        }
        return 0;
    }
}
