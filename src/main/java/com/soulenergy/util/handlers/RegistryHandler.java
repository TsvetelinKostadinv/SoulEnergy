package com.soulenergy.util.handlers;



import com.soulenergy.init.ItemsContainer;
import com.soulenergy.items.ItemCore;
import com.soulenergy.util.IModelRenderer;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemsContainer.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(ItemCore item : ItemsContainer.ITEMS)
		{
			if(item instanceof IModelRenderer)
			{
				((IModelRenderer)item).registerModels();
			}
		}
	}
}
