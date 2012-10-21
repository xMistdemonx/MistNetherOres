package NetherOres.Blocks;

import java.util.Random;

import NetherOres.Common.CommonProxy;
import NetherOres.Common.NetherOresIDS;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;


public class NetherGold extends NetherOre {

	public NetherGold (int id) {
		super(id, 254, Material.rock);
		setHardness(3.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("Nether Gold");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return NetherOresIDS.NetherGold_BLOCK_ID;
	
	
	
	
	
	}
}