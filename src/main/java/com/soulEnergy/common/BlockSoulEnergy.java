package com.soulEnergy.common;

import com.soulEnergy.utils.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public abstract class BlockSoulEnergy extends Block
{
    private String name;
    private String modID = Reference.MOD_ID;
    

    public BlockSoulEnergy ( Material materialIn , String name)
    {
        super( materialIn );
        this.name = name;
    }

    public BlockSoulEnergy ( Material blockMaterialIn , MapColor blockMapColorIn , String name)
    {

        super( blockMaterialIn , blockMapColorIn );
        this.setName( name );
    }

    @Override
    public Block setUnlocalizedName(String name) {

        this.name  = name;
        name = modID + "." + name;
        return super.setUnlocalizedName(name);
    }

    protected String getName () { return name; }

    public void setName ( String name ) { this.name = name; }
    
    public String getModID () { return modID; }

    

    

}
