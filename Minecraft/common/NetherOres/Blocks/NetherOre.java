package NetherOres.Blocks;

import java.util.List;
import java.util.Random;

import NetherOres.Common.NOptions;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPigZombie;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class NetherOre extends Block{

	public NetherOre(int id, int tex, Material material) {
		super(id, tex, material);
	}
	
	@Override
	public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player) {
		Random rand = new Random();
		int randomint = rand.nextInt(NOptions.aggroChance);
		int randompick = rand.nextInt(NOptions.aggroChance);
		if(randomint == randompick) {
			this.angerPigmen(player, world, x, y, z);
		}
		
	}
	
	public void angerPigmen(EntityLiving player, World world, int x, int y, int z) {
		if(NOptions.angerPigmen) { 
			List list = world.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(x - NOptions.aggroRange, y - NOptions.aggroRange, z - NOptions.aggroRange, x + NOptions.aggroRange + 1, y + NOptions.aggroRange + 1, z + NOptions.aggroRange + 1));
			for(int i = 0; i < list.size(); i++) {
				EntityLiving ent = (EntityLiving)list.get(i);
				if(ent instanceof EntityPigZombie) {
					EntityPigZombie epz = (EntityPigZombie)ent;
					epz.setTarget(player);
				}
				
			}
		}
	}
	
	

}
