package com.soulenergy.init;

import java.util.ArrayList;
import java.util.List;

import com.soulenergy.items.ItemCore;
import com.soulenergy.items.batteries.BasicBattery;

import net.minecraft.item.Item;

public class ItemsContainer 
{
	public static final List<ItemCore> ITEMS = new ArrayList<ItemCore>();
	
	public static final Item RUBY = new ItemCore("ruby");
	public static final Item OBSIDIAN_INGOT = new ItemCore("obsidian_ingot");
	
	public static final BasicBattery basicBattery = new BasicBattery();
	
	

}
