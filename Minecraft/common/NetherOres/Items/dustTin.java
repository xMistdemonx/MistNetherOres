package NetherOres.Items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import NetherOres.Common.CommonProxy;

public class dustTin extends Item{
	{
}
	

	protected dustTin(int par1)
        {
                super(par1);
                this.setItemName("Tin Dust");
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(0, 0);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}
