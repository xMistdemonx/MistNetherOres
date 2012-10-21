package NetherOres.Items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import NetherOres.Common.CommonProxy;

public class dustSilver extends Item{
	
	protected dustSilver(int par1)
    {
            super(par1);
            this.setItemName("Silver Dust");
          
          setTextureFile(CommonProxy.ITEMS_PNG);
          setIconCoord(1, 0);
          setCreativeTab(CreativeTabs.tabMaterials);
    }
}