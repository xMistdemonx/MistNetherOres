package NetherOres.Items;

import NetherOres.Common.NetherOresIDS;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class NetherOresItemReg {

	public static Item dustTin;
	public static Item dustCopper;
	public static Item dustSilver;
	
	
	public static Item ingotTin;
	public static Item ingotCopper;
	public static Item ingotSilver;
	public static Item netherAmulet;
	public static Item lavaPearl;
	public static Item ItemChain;
	
	
	
	
	
	public static void Init() {
		

		dustTin = new dustTin(NetherOresIDS.TIN_DUST_ITEM_ID);
		dustCopper = new dustCopper(NetherOresIDS.COPPER_DUST_ITEM_ID);
		dustSilver = new dustSilver(NetherOresIDS.SILVER_DUST_ITEM_ID);
		
		ingotTin = new ItemTin(NetherOresIDS.TIN_ITEM_ID);
		ingotCopper = new ItemCopper(NetherOresIDS.COPPER_ITEM_ID);
		ingotSilver = new ItemSilver(NetherOresIDS.SILVER_ITEM_ID);
		
		netherAmulet = new NetherAmulet(NetherOresIDS.NETHER_AMULET_ID);
		
		lavaPearl = new LavaPearl(NetherOresIDS.LAVA_PEARL_ID);
		
		ItemChain = new ItemChain(NetherOresIDS.ITEM_CHAIN_ID);
		
		
		

		OreDictionary.registerOre("dustCopper", new ItemStack(dustCopper));
		OreDictionary.registerOre("dustTin", new ItemStack(dustTin));
		OreDictionary.registerOre("dustSilver", new ItemStack(dustSilver));
		
		OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
		OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ingotSilver));
		
		

		LanguageRegistry.addName(dustTin, "Tin Dust");
		LanguageRegistry.addName(dustCopper, "Copper Dust");
		LanguageRegistry.addName(dustSilver, "Silver Dust");
		
		LanguageRegistry.addName(ingotTin, "Tin Ingot");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(ingotSilver, "Silver Ingot");
		LanguageRegistry.addName(netherAmulet, "Nether Amulet");
		LanguageRegistry.addName(lavaPearl, "Lava Pearl");
		LanguageRegistry.addName(ItemChain, "Gold Chain");
	}
	
}
