package NetherOres.Blocks;

import java.util.Random;

import NetherOres.Common.CommonProxy;
import NetherOres.Common.NetherOresIDS;
import NetherOres.Items.NetherOresItemReg;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class NetherCopper  extends NetherOre{

	public NetherCopper (int id) {
		super(id, 248, Material.rock);
		setHardness(3.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("Nether Copper");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return NetherOresIDS.NetherCopper_BLOCK_ID;
	
	
	
	
	
	}
}

