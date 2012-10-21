package NetherOres.Blocks;

import java.util.Random;

import NetherOres.Common.CommonProxy;
import NetherOres.Common.NetherOresIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class LavaStone extends Block {
//239
	public LavaStone (int id) {
		super(id, 239, Material.rock);
		setHardness(10.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		setLightValue(1.0F);
		setBlockName("LavaStone");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
}