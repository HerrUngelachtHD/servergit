package de.unhd.ugit;

import de.unhd.ugit.command.cmd_play;
import de.unhd.ugit.command.cmd_wetter;
import de.unhd.ugit.command.cmd_clearmychat;
import de.unhd.ugit.command.cmd_day;
import de.unhd.ugit.command.cmd_gamemode;
import de.unhd.ugit.command.cmd_johndoe;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin {
	
	public static String prefix = "§6[ultimategit] §7";
	public static String game = "§8✦ §9§lServer§8│ §7";
	public static String version = "Build 1.0.0-INDEV";
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§a");
		Bukkit.getConsoleSender().sendMessage("§aAktiviere §7ultimategit (" + String.valueOf(version) + " §8// §7'§a§omaster§7'§7)");
		Bukkit.getConsoleSender().sendMessage("§a");
		getCommand("play").setExecutor(new cmd_play());
		getCommand("clearmychat").setExecutor(new cmd_clearmychat());
		getCommand("cmc").setExecutor(new cmd_clearmychat());
		getCommand("johndoe").setExecutor(new cmd_johndoe());
		getCommand("allwissend").setExecutor(new cmd_johndoe());
		getCommand("gamemode").setExecutor(new cmd_gamemode());
		getCommand("gm").setExecutor(new cmd_gamemode());
		getCommand("day").setExecutor(new cmd_day());
		getCommand("night").setExecutor(new cmd_day());
		getCommand("sun").setExecutor(new cmd_wetter());
		getCommand("rain").setExecutor(new cmd_wetter());
		getCommand("thunder").setExecutor(new cmd_wetter());
		getCommand("git").setExecutor(this);
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§a");
		Bukkit.getConsoleSender().sendMessage("§cDeaktiviere §7ultimategit (" + String.valueOf(version) +  " §8// §7'§a§omaster§7'§7)");
		Bukkit.getConsoleSender().sendMessage("§a");
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  if (label.equalsIgnoreCase("git")) {   
		      if (sender instanceof Player) {
			        Player player = (Player)sender;
			        if (args.length == 0) {
			          player.sendMessage(String.valueOf(prefix) + "§aUltimateGit version (" + String.valueOf(version) + ") by HerrUngelachtHD");
			        } 
			        
			          if (args.length == 1) {
				            if (args[0].equalsIgnoreCase("help")) {
				            	if (player.hasPermission("command.git.help")) {
					              player.sendMessage(String.valueOf(prefix) + "§7Liste aller befehle:");
					              player.sendMessage("§8» §a/git <-perms/permissions>");
					              player.sendMessage("§8» §a/git <help>");
					              player.sendMessage("§8");
					              player.sendMessage("§8» §a/play <server gruppe>");
					              player.sendMessage("§8» §a/gamemode <spiele modus>");
					              player.sendMessage("§8» §a/day");
					              player.sendMessage("§8» §a/night");
					              player.sendMessage("§8» §a/sun");
					              player.sendMessage("§8» §a/rain");
					              player.sendMessage("§8» §a/thunder");
					              player.sendMessage("§8» §a/clearmychat");
					              player.sendMessage("§8» §a/johndoe");
				            	} else {
				                  player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
				            	}
				            }
			          }
			        
			          if (args.length == 1) {
			            if (args[0].equalsIgnoreCase("permissions") | args[0].equalsIgnoreCase("-perms")) {
			            	if (player.hasPermission("command.git.permissions")) {
				              player.sendMessage(String.valueOf(prefix) + "§7Liste aller Permissions:");
				              player.sendMessage("§8» §bcommand.git.help");
				              player.sendMessage("§8» §bcommand.git.permissions");
				              player.sendMessage("§8» §bcommand.git.daynight");
				              player.sendMessage("§8» §bcommand.git.gamemode");
				              player.sendMessage("§8» §bcommand.git.weather");
				              player.sendMessage("§8» §bcommand.play.listserver");
				              player.sendMessage("§8» §bcommand.play.bauserver");
			            	} else {
			                  player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
			            	}
			            }
				       
			          }  
			      }
		}
		return false;
	}
}
