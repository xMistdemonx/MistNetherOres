package NetherOres.Blocks;

import java.util.Random;

import NetherOres.Common.CommonProxy;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class NetherRedStone extends NetherOre {

	public NetherRedStone (int id) {
		super(id, 253, Material.rock);
		setHardness(3.5F);
		setResistance(10.0F);
		setStepSound(soundStoneFootstep);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("Nether RedStone");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
	public int quantityDropped(Random random)
	{
		return 1 + random.nextInt(8);
		}

	
	public int idDropped(int par1, Random random, int par2) 
	{
		return Item.redstone.shiftedIndex;
		}
}
