package de.unhd.ugit.command;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.unhd.ugit.main;

public class cmd_gamemode implements CommandExecutor{
		static String game = main.game;
		static String prefix = main.prefix;

		
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			  if (label.equalsIgnoreCase("gamemode") | (label.equalsIgnoreCase("gm"))) {   
			      if (sender instanceof Player) {
				        Player player = (Player)sender;
				          if (args.length == 0) {
					            if (player.hasPermission("command.git.gamemode")) {
						              player.sendMessage(String.valueOf(game) + "§7Bitte wähle einen spielemodus!");
					            	} else {
					                  player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
					            }
				          }
				        
				          if (args.length == 1) {
					            if (args[0].equalsIgnoreCase("0")) {
					            	if (player.hasPermission("command.git.gamemode")) {
						              player.sendMessage(String.valueOf(game) + "§7Du hast den gamemode zu §eSURVIVAL §7gewechselt!");
						              player.setGameMode(GameMode.SURVIVAL);
					            	} else {
					                  player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
					            	}
					            }
				          }
				          
				          if (args.length == 1) {
					            if (args[0].equalsIgnoreCase("1")) {
					            	if (player.hasPermission("command.git.gamemode")) {
						              player.sendMessage(String.valueOf(game) + "§7Du hast den gamemode zu §eCREATIVE §7gewechselt!");
						              player.setGameMode(GameMode.CREATIVE);
					            	} else {
					                  player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
					            	}
					            }
				          }
				        
				          if (args.length == 1) {
					            if (args[0].equalsIgnoreCase("2")) {
					            	if (player.hasPermission("command.git.gamemode")) {
						              player.sendMessage(String.valueOf(game) + "§7Du hast den gamemode zu §eADVENTURE §7gewechselt!");
						              player.setGameMode(GameMode.ADVENTURE);
					            	} else {
					                  player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
					            	}
					            }
				          }
				          
				          if (args.length == 1) {
					            if (args[0].equalsIgnoreCase("3")) {
					            	if (player.hasPermission("command.git.gamemode")) {
						              player.sendMessage(String.valueOf(game) + "§7Du hast den gamemode zu §eSPECTATOR §7gewechselt!");
						              player.setGameMode(GameMode.SPECTATOR);
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
