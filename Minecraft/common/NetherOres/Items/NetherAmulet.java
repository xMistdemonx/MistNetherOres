package NetherOres.Items;

import java.util.List;

import NetherOres.Common.CommonProxy;
import NetherOres.Common.NOptions;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPigZombie;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class NetherAmulet extends Item{

	protected NetherAmulet(int par1) {
		super(par1);
		this.setIconIndex(4);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setItemName("Nether Amulet");
		this.setMaxStackSize(1);
		this.setMaxDamage(NOptions.amuletUses);
	}
	
	@Override
	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		goawayPigmen(world, player, (int)player.posX, (int)player.posY, (int)player.posZ);
		itemstack.damageItem(1, player);
		return itemstack;
    }
	@Override
	public void addInformation(ItemStack itemstack, List list) {
		list.add("Pigmen do not like this...");
	}
	
	public void goawayPigmen(World world, EntityLiving player, int x, int y, int z) {
		List list = world.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(x - NOptions.amuletRange, y - NOptions.amuletRange, z - NOptions.amuletRange, x + NOptions.amuletRange + 1, y + NOptions.amuletRange + 1, z + NOptions.amuletRange + 1));
		
		for(int i = 0; i < list.size(); i++) {
			EntityLiving ent = (EntityLiving)list.get(i);
			if(ent instanceof EntityPigZombie) {
				EntityPigZombie epz = (EntityPigZombie)ent;
				epz.setTarget(epz);
			}
		}
	}
	
}
