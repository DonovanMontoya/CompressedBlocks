package com.compressedblocks.mod.creativetab;

import com.compressedblocks.mod.init.ModBlocks;
import com.compressedblocks.mod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabCompressedBlocks
{
    public static final CreativeTabs CB_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.CompDiamondBlock);
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Compressed Blocks";
        }

    };
}