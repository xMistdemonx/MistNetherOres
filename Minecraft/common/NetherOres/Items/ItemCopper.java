package NetherOres.Items;

import NetherOres.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemCopper extends Item{
	
	protected ItemCopper(int par1)
    {
            super(par1);
            this.setItemName("Copper Ingot");
          
          setTextureFile(CommonProxy.ITEMS_PNG);
          setIconCoord(2, 1);
          setCreativeTab(CreativeTabs.tabMaterials);
    }
}
