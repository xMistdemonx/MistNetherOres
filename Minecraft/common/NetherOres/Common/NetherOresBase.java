package NetherOres.Common;

import net.minecraft.src.Item;
import NetherOres.Blocks.NetherOresReg;
import NetherOres.Handlers.ConfigHandler;
import NetherOres.Items.ItemCopper;
import NetherOres.Items.NetherOresItemReg;
import NetherOres.WorldGen.WorldGenNether;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;




@Mod(modid="NetherOres", name="NetherOres", version="0.1.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class NetherOresBase {
	

        // The instance of your mod that Forge uses.
	@Instance("NetherOres")
	public static NetherOresBase instance;
	
	
	
	// Says where the client and server 'proxy' code is loaded.
	
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		NetherOresReg.Init();
		NetherOresItemReg.Init();
		Recipes.Init();
		GameRegistry.registerWorldGenerator(new WorldGenNether());
		
		//Proxy stuff
		//proxy.registerRenderers();
		//proxy.initTiles();
		
	}
																					
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
		
		if(Loader.isModLoaded("IC2")) {
			RecipesIC2.Init();
		}else{
			Smelting.Init();
		}
	}
}