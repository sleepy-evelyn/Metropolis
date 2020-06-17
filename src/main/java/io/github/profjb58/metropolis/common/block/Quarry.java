package io.github.profjb58.metropolis.common.block;

import io.github.profjb58.metropolis.Metropolis;
import io.github.profjb58.metropolis.api.tileentities.MTileEntityTypes;
import io.github.profjb58.metropolis.common.tileentity.MarkerTE;
import io.github.profjb58.metropolis.common.tileentity.QuarryTE;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.IBlockReader;

public class Quarry extends Block {
    public Quarry(String name) {
        super(Block.Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f));
        setRegistryName(Metropolis.MOD_ID, name);
    }

    @Override
    public boolean hasTileEntity(BlockState state){
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world){
        return MTileEntityTypes.QUARRY_TE.create();
    }
}
