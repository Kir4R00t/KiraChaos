package me.kirar00t.kirachaos.listeners;

// Bukkit imports
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

public class cowBreeding implements Listener {
    @EventHandler
    public void onEntityBreed(EntityBreedEvent event) {
        if (event.getEntityType() == EntityType.COW && event.getBreeder() instanceof Player) {
            Horse babyHorse = (Horse) event.getEntity();
            babyHorse.setCustomName("Dinnerbone");
            babyHorse.setCustomNameVisible(false);
        }
    }
}
