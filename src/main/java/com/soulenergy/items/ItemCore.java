package com.soulenergy.items;


import com.soulenergy.SoulEnergy;
import com.soulenergy.init.ItemsContainer;
import com.soulenergy.util.IModelRenderer;
import com.soulenergy.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemCore extends Item implements IModelRenderer
{
    private String name;
    private final String modID = Reference.MOD_ID;

    public ItemCore ( String name )
    {

        this.name = name;
        
        this.setUnlocalizedName( name );
        
        setRegistryName(  name );
        setCreativeTab( CreativeTabs.MATERIALS );

        ItemsContainer.ITEMS.add( this );
    }


    @Override
    public void registerModels () 
    {

        SoulEnergy.proxy.registerItemRenderer( this , 0 , "inventory" );
    }

    public String getName () 
    {
        return name;
    }


    public String getModID () 
    {
        return modID;
    }
    
    @Override
    public String getUnlocalizedName () 
    {
        
        return super.getUnlocalizedName();
    }
    
    
    @Override
    public Item setUnlocalizedName ( String unlocalizedName ) 
    {
        super.setUnlocalizedName( modID + "." + unlocalizedName );
        return this;
    }
    

}
