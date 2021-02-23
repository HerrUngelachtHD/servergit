package de.unhd.ugit.command;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


import de.unhd.ugit.main;

public class cmd_play implements CommandExecutor{
	static String game = main.game;
	static String prefix = main.prefix;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  if (label.equalsIgnoreCase("play")) {   
		      if (sender instanceof Player) {
			        Player player = (Player)sender;
			        if (args.length == 0) {
			          player.sendMessage(String.valueOf(game) + "§7Bitte nutze den §cNavigator §7in der §aLobby§7 um ein Spielmodus auszuwählen!");
			        } 
			          if (args.length == 1) {
				            if (args[0].equalsIgnoreCase("freebuild")) {
				              player.sendMessage(String.valueOf(game) + "§7Verbinde zum server §eFreeBuild-0§7!");
					            Bukkit.getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
					            ByteArrayOutputStream ba = new ByteArrayOutputStream();
					            DataOutputStream outa = new DataOutputStream(ba);
					            try {
					              outa.writeUTF("Connect");
					              outa.writeUTF("Freebuild-");
					            } catch (IOException iOException) {}
					            player.sendPluginMessage((Plugin)this, "BungeeCord", ba.toByteArray());
				            }
			            
			           
			            if (args[0].equalsIgnoreCase("community")) {
				              player.sendMessage(String.valueOf(game) + "§7Verbinde zum server §eCommunity-0§7!");
				  
				            Bukkit.getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
				            ByteArrayOutputStream ba = new ByteArrayOutputStream();
				            DataOutputStream outa = new DataOutputStream(ba);
				            try {
				              outa.writeUTF("Connect");
				              outa.writeUTF("Community-1");
				            } catch (IOException iOException) {}
				            player.sendPluginMessage((Plugin)this, "BungeeCord", ba.toByteArray());
			            }
			            
			            if (args[0].equalsIgnoreCase("bedwars")) {
				              player.sendMessage(String.valueOf(game) + "§7Verbinde zum server §eBedwars-1§7!");
				  
				            Bukkit.getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
				            ByteArrayOutputStream ba = new ByteArrayOutputStream();
				            DataOutputStream outa = new DataOutputStream(ba);
				            try {
				              outa.writeUTF("Connect");
				              outa.writeUTF("Bedwars-1");
				            } catch (IOException iOException) {}
				            player.sendPluginMessage((Plugin)this, "BungeeCord", ba.toByteArray());
			            }
			            
			            if (args[0].equalsIgnoreCase("lobby")) {
				              player.sendMessage(String.valueOf(game) + "§7Verbinde zum server §eLobby-1§7!");
				  
				            Bukkit.getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
				            ByteArrayOutputStream ba = new ByteArrayOutputStream();
				            DataOutputStream outa = new DataOutputStream(ba);
				            try {
				              outa.writeUTF("Connect");
				              outa.writeUTF("Lobby-1");
				            } catch (IOException iOException) {}
				            player.sendPluginMessage((Plugin)this, "BungeeCord", ba.toByteArray());
			            }
			            
			            
			            if (args[0].equalsIgnoreCase("sandkasten")) {
			            	if (player.hasPermission("command.play.bauserver")) {
				              player.sendMessage(String.valueOf(game) + "§7Verbinde zum server §eSandkasten-0§7!");
				  
					          Bukkit.getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
					          ByteArrayOutputStream ba = new ByteArrayOutputStream();
					          DataOutputStream outa = new DataOutputStream(ba);
					          try {
					            outa.writeUTF("Connect");
					            outa.writeUTF("Sandkasten-0");
					          } catch (IOException iOException) {}
					          player.sendPluginMessage((Plugin)this, "BungeeCord", ba.toByteArray());
				            
			            	} else {
			                  player.sendMessage(String.valueOf(game) + "§7Du darfst dich §cnicht§7 auf diesen Server verbinden!");
			            	}
			            }
			            
				            
				            
				        if (args[0].equalsIgnoreCase("list")) {
				        	if (player.hasPermission("command.play.listserver")) {
					              player.sendMessage(String.valueOf(game) + "§7Liste aller verfügbaren Server: §eFreeBuild§7, §eCommunity§7, §eLobby§7, §eBedWars§7, §eSandkasten");
					              
			            	} else {
				                  player.sendMessage(String.valueOf(game) + "§cDu darfst diesen befehl nicht nutzen!");
				            	}
				        }
				        
				        if (args[0].equalsIgnoreCase("version")) {
				              player.sendMessage(String.valueOf(prefix) + "§aServerGit version (Build 1.0.5 | implement in UGit) by HerrUngelachtHD");    
				        }
				        
				        if (args[0].equalsIgnoreCase("info")) {
				              player.sendMessage(String.valueOf(prefix) + "§aServerGit wurde eigendlich für den RPG-Server §criseoflinos.com §aentwickelt um schnell von Server zu Server zu switchen für die Teammitglieder!");    
				        }
				       
			          }  
			      }
		}
		return false;
	}
}
