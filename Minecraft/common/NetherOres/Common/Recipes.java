package NetherOres.Common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import NetherOres.Blocks.NetherOresReg;
import NetherOres.Items.NetherOresItemReg;

public class Recipes 
{

	public static void Init()
	{
	
	GameRegistry.addRecipe(new ItemStack(NetherOresItemReg.lavaPearl, 1), new Object[]
            {
        "ZXZ","XYX","ZXZ", 'X', NetherOresReg.LavaStone, 'Y', Item.enderPearl, 'Z', Item.porkCooked
    });

	
	GameRegistry.addRecipe(new ItemStack(NetherOresItemReg.ItemChain, 4), new Object[]
            {
        "X  "," X ","  X", 'X', Item.goldNugget
    });
	
	
	
	GameRegistry.addRecipe(new ItemStack(NetherOresItemReg.netherAmulet, 1), new Object[]
            {
        "Z Z","Z Z"," X ", 'X', NetherOresItemReg.lavaPearl, 'Z', NetherOresItemReg.ItemChain
    });
	
	}
	
}
