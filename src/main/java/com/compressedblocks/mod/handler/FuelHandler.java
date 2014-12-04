/* {package com.compressedblocks.mod.handler;


import com.compressedblocks.mod.CompressedBlocks;
import com.compressedblocks.mod.reference.Reference;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.Block;

public class FuelHandler implements IFuelHandler  {

    public FuelHandler() {
    }

    @Override
    public int getBurnTime(ItemStack fuel) {
        if(fuel.itenID == CompressedBlocks.CompCoalBlock.blockID) return 9999;
        return 0;


    }

}
*/
