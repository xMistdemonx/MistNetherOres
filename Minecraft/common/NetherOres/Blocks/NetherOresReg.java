package NetherOres.Blocks;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import NetherOres.Common.NOptions;
import NetherOres.Common.NetherOresIDS;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPigZombie;
import net.minecraft.src.World;

public class NetherOresReg {
	
	
	public static Block NetherCoal;
	public static Block NetherIron;
	public static Block NetherGold;
	public static Block NetherRedStone;
	public static Block NetherDiamond;
	public static Block LavaStone;
	public static Block NetherTin;
	public static Block NetherCopper;
	public static Block NetherSilver;
	public static Block NetherLapis;
	public static Block NetherEmerald;
	
	
	
	
	public static void Init()
	{
	
	NetherCoal = (new NetherCoal(NetherOresIDS.NetherCoal_BLOCK_ID));
	NetherIron = (new NetherIron(NetherOresIDS.NetherIron_BLOCK_ID));
	NetherGold = (new NetherGold(NetherOresIDS.NetherGold_BLOCK_ID));
	NetherRedStone = (new NetherRedStone(NetherOresIDS.NetherRedStone_BLOCK_ID));
	NetherDiamond = (new NetherDiamond(NetherOresIDS.NetherDiamond_BLOCK_ID));
	NetherTin = (new NetherTin(NetherOresIDS.NetherTin_BLOCK_ID));
	NetherCopper = (new NetherCopper(NetherOresIDS.NetherCopper_BLOCK_ID));
	NetherSilver = (new NetherSilver(NetherOresIDS.NetherSilver_BLOCK_ID));
	NetherLapis = (new NetherLapis(NetherOresIDS.NetherLapis_BLOCK_ID));
	NetherEmerald = (new NetherEmerald(NetherOresIDS.NetherEmerald_BLOCK_ID));
	LavaStone = (new LavaStone(NetherOresIDS.LavaStone_BLOCK_ID));
	
	
	
	
	

	GameRegistry.registerBlock(NetherCoal);
	GameRegistry.registerBlock(NetherIron);
	GameRegistry.registerBlock(NetherGold);
	GameRegistry.registerBlock(NetherRedStone);
	GameRegistry.registerBlock(NetherDiamond);
	GameRegistry.registerBlock(NetherTin);
	GameRegistry.registerBlock(NetherCopper);
	GameRegistry.registerBlock(NetherSilver);
	GameRegistry.registerBlock(NetherLapis);
	GameRegistry.registerBlock(NetherEmerald);
	GameRegistry.registerBlock(LavaStone);
	
	
	
	
	
	
	LanguageRegistry.addName(NetherCoal, "Nether Coal");
	LanguageRegistry.addName(NetherIron, "Nether Iron");
	LanguageRegistry.addName(NetherGold, "Nether Gold");
	LanguageRegistry.addName(NetherRedStone, "Nether RedStone");
	LanguageRegistry.addName(NetherDiamond, "Nether Diamond");
	LanguageRegistry.addName(NetherTin, "Nether Tin");
	LanguageRegistry.addName(NetherCopper, "Nether Copper");
	LanguageRegistry.addName(NetherSilver, "Nether Silver");
	LanguageRegistry.addName(NetherLapis, "Nether Lapis Lazuli");
	LanguageRegistry.addName(NetherEmerald, "Nether Emerald");
	LanguageRegistry.addName(LavaStone, "Lava Stone");
	
	}

}
