package NetherOres.Common;

import NetherOres.Items.NetherOresItemReg;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public static void Init() {
		
		
		GameRegistry.addSmelting(NetherOresIDS.NetherIron_BLOCK_ID, new ItemStack(Item.ingotIron), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherGold_BLOCK_ID, new ItemStack(Item.ingotGold), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherTin_BLOCK_ID, new ItemStack(NetherOresItemReg.ingotTin), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherCopper_BLOCK_ID, new ItemStack(NetherOresItemReg.ingotCopper), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherTin_BLOCK_ID, new ItemStack(NetherOresItemReg.ingotSilver), 0);
		
		//GameRegistry.addSmelting(NetherOresItemReg.dustTin.shiftedIndex, new ItemStack(NetherOresItemReg.ingotTin), 0);
		//GameRegistry.addSmelting(NetherOresItemReg.dustCopper.shiftedIndex, new ItemStack(NetherOresItemReg.ingotCopper), 0);
		//GameRegistry.addSmelting(NetherOresItemReg.dustSilver.shiftedIndex, new ItemStack(NetherOresItemReg.ingotSilver), 0);
	}
}
