package NetherOres.WorldGen;

import java.util.Random;

import NetherOres.Common.NOptions;
import NetherOres.Common.NetherOresIDS;


import net.minecraft.src.Block;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenNether implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		
		
		
		/*switch(world.provider.dimensionId) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16); break;
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16); break;
		}*/
		
		
		if(world.provider.dimensionId == -1) {
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		}
	}

//(Max y - min y) + min y
/*	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		

		}*/


	public void generateNether(World world, Random rand, int chunkX, int chunkZ)
	{
		if(NOptions.genLavaStone)
		for (int i = 0; i < 15; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherGenLavaStone().generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genCoal)
		for (int i = 0; i < 15; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherCoal_BLOCK_ID, 7).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genIron)
		for (int i = 0; i < 15; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(70);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherIron_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genGold)
		for (int i = 0; i < 10; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(123 - 55);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherGold_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genDiamond)
		for (int i = 0; i < 6; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(123 - 70);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherDiamond_BLOCK_ID, 4).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genRedstone)
		for (int i = 0; i < 15; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherRedStone_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genTin)
		for(int i = 0; i < 15; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherTin_BLOCK_ID, 6).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genCopper)
		for(int i = 0; i < 15; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherCopper_BLOCK_ID, 8).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genSilver)
		for(int i = 0; i < 15; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherSilver_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genLapis)
		for(int i = 0; i < 7; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherLapis_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		if(NOptions.genEmerald)
		for(int i = 0; i < 5; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new NetherOresWorldGen(NetherOresIDS.NetherEmerald_BLOCK_ID, 2).generate(world, rand, randPosX, randPosY, randPosZ);
		}


	}


}