package NetherOres.Items;

import NetherOres.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemSilver extends Item{
	
	protected ItemSilver(int par1)
    {
            super(par1);
            this.setItemName("Silver Ingot");
          
          setTextureFile(CommonProxy.ITEMS_PNG);
          setIconCoord(1, 1);
          setCreativeTab(CreativeTabs.tabMaterials);
    }
}