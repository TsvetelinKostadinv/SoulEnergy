package com.soulEnergy.utils;

import com.soulEnergy.proxies.*;

public class Reference
{
    
    public static final String MOD_ID = "soulen";
    public static final String MOD_NAME = "Soul Energy";
    public static final String MOD_DESCRIPRION = "Tap into your inner energy portal and delve into unbeliavable new depths of technology";
    public static final String MOD_VERSION = "1.0";
    
    public static final String PROXIES_LOCATION = "com.soulEnergy.proxies";
    
    public static final String COMMON_PROXY_ALTERNATIVE_LOCATION = PROXIES_LOCATION + ".ClientProxy";
    public static final String CLIENT_PROXY_ALTERNATIVE_LOCATION = PROXIES_LOCATION + ".CommonProxy";
    
    public static final String COMMON_PROXY_LOCATION = CommonProxy.class.getName();
    public static final String CLIENT_PROXY_LOCATION = ClientProxy.class.getName();
}
