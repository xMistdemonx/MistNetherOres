package NetherOres.Blocks;

import java.util.Random;

import NetherOres.Common.CommonProxy;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class NetherCoal extends NetherOre {

		public NetherCoal (int id) {
			super(id, 251, Material.rock);
			setHardness(3.5F);
			setResistance(10.0F);
			setStepSound(soundStoneFootstep);
			setCreativeTab(CreativeTabs.tabBlock);
			setBlockName("Nether Coal");
		}
		
		
		public String getTextureFile () {
			return CommonProxy.BLOCK_PNG;
		}
		
		public int quantityDropped(Random random)
		{
			return 1 + random.nextInt(4);
			}

		
		public int idDropped(int par1, Random random, int par2) 
		{
			return Item.coal.shiftedIndex;
			}
	}