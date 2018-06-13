package com.soulEnergy.utils;

import com.soulEnergy.proxies.*;

public class Reference
{
    public static final String PROXIES_LOCATION = "com.soulEnergy.proxies";
    
    public static final String COMMON_PROXY_ALTERNATIVE_LOCATION = PROXIES_LOCATION + ".ClientProxy";
    public static final String CLIENT_PROXY_ALTERNATIVE_LOCATION = PROXIES_LOCATION + ".CommonProxy";
    
    public static final String COMMON_PROXY_LOCATION = CommonProxy.class.getName();
    public static final String CLIENT_PROXY_LOCATION = ClientProxy.class.getName();
}
