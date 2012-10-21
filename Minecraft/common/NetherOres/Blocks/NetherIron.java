package NetherOres.Blocks;

import java.util.Random;

import NetherOres.Common.CommonProxy;
import NetherOres.Common.NetherOresIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class NetherIron extends NetherOre {

	public NetherIron (int id) {
		super(id, 252, Material.rock);
		setHardness(3.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("Nether Iron");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return NetherOresIDS.NetherIron_BLOCK_ID;
	
	
	
	
	
	}
}