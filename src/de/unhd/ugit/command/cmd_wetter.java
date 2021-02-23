package de.unhd.ugit.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.unhd.ugit.main;

public class cmd_wetter implements CommandExecutor{
	static String game = main.game;
	static String prefix = main.prefix;

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  if (label.equalsIgnoreCase("sun")) {   
		      if (sender instanceof Player) {
			        Player player = (Player)sender;
			          if (args.length == 0) {
				            if (player.hasPermission("command.git.weather")) {
					              player.sendMessage(String.valueOf(game) + "§7Du hast das Wetter auf §eSONNE§7 gesetzt!");
			                        player.getLocation().getWorld().setThundering(false);
			                        player.getLocation().getWorld().setStorm(false);
				            }

				            	} else {
				            		player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
				            }
			          }
		      }
		  if (label.equalsIgnoreCase("rain")) {   
		      if (sender instanceof Player) {
			        Player player = (Player)sender;
			          if (args.length == 0) {
				            if (player.hasPermission("command.git.weather")) {
					              player.sendMessage(String.valueOf(game) + "§7Du hast das Wetter auf §eREGEN§7 gesetzt!");
					              if(!player.getWorld().hasStorm()){   
			                           
			                            player.getLocation().getWorld().setStorm(true);
			                            
					              }
				            	} else {
				            		player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
				            }
			          }
		      }
		  }
		  if (label.equalsIgnoreCase("thunder")) {   
		      if (sender instanceof Player) {
			        Player player = (Player)sender;
			          if (args.length == 0) {
				            if (player.hasPermission("command.git.weather")) {
					              player.sendMessage(String.valueOf(game) + "§7Du hast das Wetter auf §eGEWITTER§7 gesetzt!");
			                            player.getLocation().getWorld().setThundering(true);
					              }
				            	} else {
				            		player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
				            }
			          }
		      }
		return false;
	}
	
}