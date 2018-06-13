package com.soulEnergy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.soulEnergy.utils.Reference;

import com.soulEnergy.proxies.CommonProxy;

@Mod(useMetadata = true,
        modid = "soulen",
        name = "Soul Energy",
        version = "1.0")
public class SoulEnergy
{
    
    
    @SidedProxy( clientSide = Reference.CLIENT_PROXY_ALTERNATIVE_LOCATION
            , serverSide = Reference.COMMON_PROXY_ALTERNATIVE_LOCATION)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit( FMLPreInitializationEvent event ) 
    {

    }

    @EventHandler
    public static void init( FMLInitializationEvent event ) 
    {

    }

    @EventHandler
    public static void postInit( FMLPostInitializationEvent event )
    {

    }

    
}
