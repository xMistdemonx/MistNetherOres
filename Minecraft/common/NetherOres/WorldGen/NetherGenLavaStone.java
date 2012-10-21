package NetherOres.WorldGen;

import java.util.Random;

import NetherOres.Common.NetherOresIDS;

import net.minecraft.src.Block;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;

public class NetherGenLavaStone extends WorldGenerator{
	
	public NetherGenLavaStone() {
		
	}
	
	 public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
	    {
	        if (!par1World.isAirBlock(par3, par4, par5))
	        {
	            return false;
	        }
	        else if (par1World.getBlockId(par3, par4 - 1, par5) != Block.lavaStill.blockID)
	        {
	            return false;
	        }
	        else
	        {
	            par1World.setBlockWithNotify(par3, par4, par5, NetherOresIDS.LavaStone_BLOCK_ID);

	            for (int var6 = 0; var6 < 250; ++var6)
	            {
	                int var7 = par3 + par2Random.nextInt(4) - par2Random.nextInt(4);
	                int var8 = par4 + par2Random.nextInt(7);
	                int var9 = par5 + par2Random.nextInt(4) - par2Random.nextInt(4);

	                if (par1World.getBlockId(var7, var8, var9) == 0)
	                {
	                    int var10 = 0;

	                    for (int var11 = 0; var11 < 6; ++var11)
	                    {
	                        int var12 = 0;

	                        if (var11 == 0)
	                        {
	                            var12 = par1World.getBlockId(var7 + 1, var8, var9);
	                        }

	                        if (var11 == 1)
	                        {
	                            var12 = par1World.getBlockId(var7 - 1, var8, var9);
	                        }

	                        if (var11 == 2)
	                        {
	                            var12 = par1World.getBlockId(var7, var8 + 1, var9);
	                        }

	                        if (var11 == 3)
	                        {
	                            var12 = par1World.getBlockId(var7, var8 - 1, var9);
	                        }

	                        if (var11 == 4)
	                        {
	                            var12 = par1World.getBlockId(var7, var8, var9 + 1);
	                        }

	                        if (var11 == 5)
	                        {
	                            var12 = par1World.getBlockId(var7, var8, var9 - 1);
	                        }

	                        if (var12 == NetherOresIDS.LavaStone_BLOCK_ID)
	                        {
	                            ++var10;
	                        }
	                    }

	                    if (var10 == 1)
	                    {
	                        par1World.setBlockWithNotify(var7, var8, var9, NetherOresIDS.LavaStone_BLOCK_ID);
	                    }
	                }
	            }

	            return true;
	        }
	    }
}
