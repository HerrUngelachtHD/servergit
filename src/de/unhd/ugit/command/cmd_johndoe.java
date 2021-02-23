package de.unhd.ugit.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.unhd.ugit.main;

public class cmd_johndoe implements CommandExecutor{
	
	static String game = main.game;
	static String prefix = main.prefix;

	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  if (label.equalsIgnoreCase("johndoe")) {   
		      if (sender instanceof Player) {
		        Player player = (Player)sender;
		        if (args.length == 0) {
		          player.sendMessage("§aES IST DER WAHRE §6JOHN DOE");
		        } 
		          if (args.length == 1) {
		            if (args[0].equalsIgnoreCase("version")) {
		              player.sendMessage(String.valueOf(prefix) + "§aJohnDoeGit version (Build JohnDoe | implement in UGit) by HerrUngelachtHD");

		            
		            }
		          }
		      }
		      
			  if (label.equalsIgnoreCase("allwissend")) {   
			      if (sender instanceof Player) {
			        Player player = (Player)sender;
			        if (args.length == 0) {
			          player.sendMessage("§r⬛§d⬛§r⬛§8⬛⬛§r⬛§d⬛§r⬛");
			          player.sendMessage("§r⬛§d⬛§r⬛⬛⬛§r⬛§d⬛§r⬛");
			          player.sendMessage("§r⬛§d⬛§r⬛⬛⬛§r⬛§d⬛§r⬛");
			          player.sendMessage("§r⬛⬛⬛⬛⬛⬛⬛⬛  §cIch bin der allwissende:");
			          player.sendMessage("§0⬛§7⬛⬛§0⬛⬛§7⬛⬛§0⬛  §4Inhaber HerrUngelachtHD");
			          player.sendMessage("§r⬛§7⬛⬛§r⬛⬛§7⬛⬛§r⬛");
			          player.sendMessage("§r⬛⬛⬛§0⬛⬛§r⬛⬛⬛");
			          player.sendMessage("§r⬛⬛⬛⬛⬛⬛⬛⬛");
			        } 
			          if (args.length == 1) {
			            if (args[0].equalsIgnoreCase("version")) {
			              player.sendMessage(String.valueOf(prefix) + "§aJohnDoeGit version (Build JohnDoe | implement in UGit) by HerrUngelachtHD");

			            
			            }
			          }
			      }
			  }
		      
		  }
		      return false;
	  }
}