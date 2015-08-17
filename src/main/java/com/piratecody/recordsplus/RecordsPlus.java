package com.piratecody.recordsplus;

import com.piratecody.recordsplus.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class RecordsPlus {
	

@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
public static CommonProxy proxy;

@Instance(Reference.MODID)
public static RecordsPlus instance;


//inits
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{

}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{

}

@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event)
{

}


	

}
