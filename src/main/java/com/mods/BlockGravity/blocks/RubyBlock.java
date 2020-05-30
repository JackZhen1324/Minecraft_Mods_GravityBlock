package com.mods.BlockGravity.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends FallingBlock {
    public RubyBlock(){
        super(Block.Properties.create(Material.SAND)
                .hardnessAndResistance(5.0f,0.0f)
                .sound(SoundType.SAND)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)

        );


    }

}
