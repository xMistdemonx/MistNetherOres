package NetherOres.Blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import NetherOres.Common.CommonProxy;

public class NetherLapis extends NetherOre {

	public NetherLapis (int id) {
		super(id, 247, Material.rock);
		setHardness(3.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("Nether Lapis");
	}
	
	
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
	public int quantityDropped(Random random)
	{
		return 1 + random.nextInt(5);
		}

	
		@Override
		protected int damageDropped(int par1) {
		return 4;
		}
	
	public int idDropped(int par1, Random random, int par2) 
	{
		return Item.dyePowder.shiftedIndex;
		}
}