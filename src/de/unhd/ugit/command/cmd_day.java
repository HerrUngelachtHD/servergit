package de.unhd.ugit.command;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.unhd.ugit.main;

public class cmd_day implements CommandExecutor{
	static String game = main.game;
	static String prefix = main.prefix;

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  if (label.equalsIgnoreCase("day")) {   
		      if (sender instanceof Player) {
			        Player player = (Player)sender;
			          if (args.length == 0) {
				            if (player.hasPermission("command.git.daynight")) {
					              player.sendMessage(String.valueOf(game) + "§7Du hast die tageszeit auf §eTAG§7 gesetzt!");
					              for(World world : Bukkit.getServer().getWorlds()){
				                         
			                            world.setTime(1000);
					              }
				            	} else {
				            		player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
				            }
			          }
		      }
		  }
		  if (label.equalsIgnoreCase("night")) {   
		      if (sender instanceof Player) {
			        Player player = (Player)sender;
			          if (args.length == 0) {
				            if (player.hasPermission("command.git.daynight")) {
					              player.sendMessage(String.valueOf(game) + "§7Du hast die tageszeit auf §eNACHT§7 gesetzt!");
					              for(World world : Bukkit.getServer().getWorlds()){
				                         
			                            world.setTime(15000);
					              }
				            	} else {
				            		player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
				            }
			          }
		      }
		  }
		return false;
	}
	
}