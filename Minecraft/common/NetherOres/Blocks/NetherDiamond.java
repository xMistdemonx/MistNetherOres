package NetherOres.Blocks;

import java.util.Random;

import NetherOres.Common.CommonProxy;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class NetherDiamond extends NetherOre {

	public NetherDiamond (int id) {
		super(id, 255, Material.rock);
		setHardness(3.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("Nether Diamond");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	

	
	public int idDropped(int par1, Random random, int par2) 
	{
		return Item.diamond.shiftedIndex;
		}
}