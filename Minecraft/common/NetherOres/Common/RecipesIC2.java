package NetherOres.Common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import NetherOres.Blocks.NetherOresReg;
import NetherOres.Items.NetherOresItemReg;
import ic2.api.Ic2Recipes;
import ic2.api.Items;

public class RecipesIC2 {
	
	public static void Init() {
		
		Ic2Recipes.addMaceratorRecipe(new ItemStack(NetherOresReg.NetherTin), new ItemStack(NetherOresItemReg.dustTin, 2));
		Ic2Recipes.addMaceratorRecipe(new ItemStack(NetherOresReg.NetherCopper), new ItemStack(NetherOresItemReg.dustCopper, 2));
		Ic2Recipes.addMaceratorRecipe(new ItemStack(NetherOresReg.NetherSilver), new ItemStack(NetherOresItemReg.dustSilver, 2));
		Ic2Recipes.addMaceratorRecipe(new ItemStack(NetherOresReg.NetherGold), new ItemStack(Items.getItem("goldDust").getItem(), 2));
		Ic2Recipes.addMaceratorRecipe(new ItemStack(NetherOresReg.NetherIron), new ItemStack(Items.getItem("ironDust").getItem(), 2));
		
		
		GameRegistry.addSmelting(NetherOresIDS.NetherIron_BLOCK_ID, new ItemStack(Item.ingotIron), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherGold_BLOCK_ID, new ItemStack(Item.ingotGold), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherTin_BLOCK_ID, new ItemStack(NetherOresItemReg.ingotTin), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherCopper_BLOCK_ID, new ItemStack(NetherOresItemReg.ingotCopper), 0);
		GameRegistry.addSmelting(NetherOresIDS.NetherSilver_BLOCK_ID, new ItemStack(NetherOresItemReg.ingotSilver), 0);
	
		GameRegistry.addSmelting(NetherOresItemReg.dustTin.shiftedIndex, new ItemStack(NetherOresItemReg.ingotTin), 0);
		GameRegistry.addSmelting(NetherOresItemReg.dustCopper.shiftedIndex, new ItemStack(NetherOresItemReg.ingotCopper), 0);
		GameRegistry.addSmelting(NetherOresItemReg.dustSilver.shiftedIndex, new ItemStack(NetherOresItemReg.ingotSilver), 0);
	}
}
												