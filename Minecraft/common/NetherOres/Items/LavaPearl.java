package NetherOres.Items;

import NetherOres.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class LavaPearl extends Item {

	protected LavaPearl(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setIconIndex(3);
		this.setItemName("Lava Pearl");
		this.setMaxStackSize(16);
	}
	
	@Override
	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}

}
