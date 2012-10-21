package NetherOres.Items;

import NetherOres.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemTin extends Item{
	{
}
	

	protected ItemTin(int par1)
        {
                super(par1);
                this.setItemName("Tin Ingot");
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(0, 1);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}
