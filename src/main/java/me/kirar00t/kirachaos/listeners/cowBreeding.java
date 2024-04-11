package me.kirar00t.kirachaos.listeners;

// Bukkit imports
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

// Java imports
import java.util.Random;

public class cowBreeding implements Listener {
    @EventHandler
    public void onEntityBreed(EntityBreedEvent event) {
        if (event.getEntityType() == EntityType.COW && event.getBreeder() instanceof Player) {
            int randomNum = new Random().nextInt(100);

            // This has 20% chance of happening
            if (randomNum <= 19) {
                event.setCancelled(true);
                Horse horse = (Horse) event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.HORSE);
                horse.setCustomName("Dinnerbone");
                horse.setCustomNameVisible(false);
            }
        }
    }
}
