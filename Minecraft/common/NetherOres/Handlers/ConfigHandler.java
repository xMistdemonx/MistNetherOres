package NetherOres.Handlers;

import java.io.File;
import java.util.logging.Level;

import NetherOres.Common.NOptions;
import NetherOres.Common.NetherOresIDS;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;

public class ConfigHandler {
	
	//public static boolean generateAmethyst;
	
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		try {
			config.load();
			//ITEMS
			config.addCustomCategoryComment("ITEM_OPTIONS", "Options for Items");
			NOptions.amuletUses = config.get("ITEM_OPTIONS", "AMULET USES", 5).getInt(5);
			NOptions.amuletRange = config.get("ITEM_OPTIONS", "AMULET_RANGE", 32).getInt(8);
			
			//OPTIONS
			config.addCustomCategoryComment("PIGMEN", "These options control how pigmen behave[aggrochance 0= always happens, 1= 50/50 chance, anything > 1 is less of a chance than 50%");
			NOptions.angerPigmen = config.get("PIGMEN", "ENABLE_AGGRO_PIGMEN", true).getBoolean(true);
			NOptions.aggroRange = config.get("PIGMEN", "PIGMEN_AGGRO_RANGE", 32).getInt(32);
			NOptions.aggroChance = config.get("PIGMEN", "AGGRO_PIGMEN_CHANCE", 1).getInt(1);
			
			
			config.addCustomCategoryComment("GENERATE", "Set to true to generate, or false to stop generation");
			NOptions.genCoal = config.get("GENERATE", "NETHER_COAL", true).getBoolean(true);
			NOptions.genCopper = config.get("GENERATE", "NETHER_COPPER", true).getBoolean(true);
			NOptions.genDiamond = config.get("GENERATE",  "NETHER_DIAMOND", true).getBoolean(true);
			NOptions.genGold = config.get("GENERATE", "NETHER_GOLD", true).getBoolean(true);
			NOptions.genIron = config.get("GENERATE", "NETHER_IRON", true).getBoolean(true);
			NOptions.genRedstone = config.get("GENERATE", "NETHER_REDSTONE", true).getBoolean(true);
			NOptions.genSilver = config.get("GENERATE", "NETHER_SILVER", true).getBoolean(true);
			NOptions.genTin = config.get("GENERATE", "NETHER_TIN", true).getBoolean(true);
			NOptions.genLapis = config.get("GENERATE", "NETHER_LAPIS", true).getBoolean(true);
			NOptions.genEmerald = config.get("GENERATE", "NETHER_EMERALD", true).getBoolean(true);
			NOptions.genLavaStone = config.get("GENERATE", "LAVASTONE", true).getBoolean(true);
			
			//Blocks
			NetherOresIDS.NetherCoal_BLOCK_ID = config.get("BLOCK", "NetherCoal_BLOCK_ID", 400).getInt(400);
			NetherOresIDS.NetherIron_BLOCK_ID = config.get("BLOCK", "NetherIron_BLOCK_ID", 401).getInt(401);
			NetherOresIDS.NetherGold_BLOCK_ID = config.get("BLOCK", "NetherGold_BLOCK_ID", 402).getInt(402);
			NetherOresIDS.NetherRedStone_BLOCK_ID = config.get("BLOCK", "NetherRedStone_BLOCK_ID", 403).getInt(403);
			NetherOresIDS.NetherDiamond_BLOCK_ID = config.get("BLOCK", "NetherDiamond_BLOCK_ID", 404).getInt(404);
			NetherOresIDS.NetherTin_BLOCK_ID = config.get("BLOCK", "NETHER_TIN_BLOCK_ID", 406).getInt(406);
			NetherOresIDS.NetherCopper_BLOCK_ID = config.get("BLOCK", "NETHER_COPPER_BLOCK_ID", 407).getInt(407);
			NetherOresIDS.NetherSilver_BLOCK_ID = config.get("BLOCK", "NETHER_SILVER_BLOCK_ID", 408).getInt(408);
			NetherOresIDS.LavaStone_BLOCK_ID = config.get("BLOCK", "LAVASTON_BLOCK_ID", 405).getInt(405);
			NetherOresIDS.NetherLapis_BLOCK_ID = config.get("BLOCK", "NETHER_LAPIS_BLOCK_ID", 409).getInt(409);
			NetherOresIDS.NetherEmerald_BLOCK_ID = config.get("BLOCK", "NETHER_EMERALD_BLOCK_ID", 410).getInt(410);
			
			//Items
			NetherOresIDS.TIN_DUST_ITEM_ID = config.get("ITEM", "TIN_DUST_ITEM_ID", 3053).getInt(3053);
			NetherOresIDS.COPPER_DUST_ITEM_ID = config.get("ITEM", "COPPER_DUST_ITEM_ID", 3054).getInt(3054);
			NetherOresIDS.SILVER_DUST_ITEM_ID = config.get("ITEM", "SILVER_DUST_ITEM_ID", 3055).getInt(3055);
			
			NetherOresIDS.TIN_ITEM_ID = config.get("ITEM", "TIN_ITEM_ID", 3056).getInt(3056);
			NetherOresIDS.COPPER_ITEM_ID = config.get("ITEM", "COPPER_ITEM_ID", 3057).getInt(3057);
			NetherOresIDS.SILVER_ITEM_ID = config.get("ITEM", "SILVER_ITEM_ID", 3058).getInt(3058);
			NetherOresIDS.NETHER_AMULET_ID = config.get("ITEM", "NETHER_AMULET_ID", 3059).getInt(3059);
			NetherOresIDS.LAVA_PEARL_ID = config.get("ITEM", "LAVA_PEARL_ID", 3060).getInt(3060);
			NetherOresIDS.ITEM_CHAIN_ID = config.get("ITEM", "GOLD_CHAIN_ID", 3061).getInt(3061);
		} 
		
		
		
		
		catch(Exception e) {
			FMLLog.log(Level.SEVERE, e, "[Error]DBlocks Cannot Load Config File!");
		}
		finally {
			config.save();
		}
	}

}