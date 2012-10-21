package NetherOres.Items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import NetherOres.Common.CommonProxy;

public class ItemChain extends Item{
	{
}
	

	protected ItemChain(int par1)
        {
                super(par1);
              setItemName("Gold Chain");
              setTextureFile(CommonProxy.ITEMS_PNG);
      		this.setIconIndex(5);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}

