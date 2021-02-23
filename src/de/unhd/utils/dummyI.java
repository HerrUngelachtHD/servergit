package de.unhd.utils;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class dummyI {
	
	@EventHandler
    public void onEntityClick(PlayerInteractEntityEvent event, PlayerInteractEvent airevent) {

        if (event.getRightClicked() instanceof Horse){


        	
            }


        }
	
	
    @EventHandler
    public void onPush(PlayerInteractEntityEvent e){
    Player player = e.getPlayer();
     Entity ent = e.getRightClicked();
     pushAwayEntity(ent, player, 3);
     
    }
    public void pushAwayEntity(Entity entity, Player p, double speed) {
    // Get velocity unit vector:
    org.bukkit.util.Vector unitVector = entity.getLocation().toVector().subtract(p.getLocation().toVector()).normalize();
    // Set speed and push entity:
    p.setVelocity(unitVector.multiply(speed));
   
    }

}
