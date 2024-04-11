package me.kirar00t.kirachaos.listeners;

// Bukkit imports
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class villagerDeath implements Listener {
    @EventHandler
    public void onVillagerDeath(EntityDeathEvent event) {
        if (event.getEntityType() == EntityType.VILLAGER) {
            final Location deathLocation = event.getEntity().getLocation();
            Location spawnLocation = deathLocation.clone().add(0, 0, 0);
            Creeper creeper = (Creeper) deathLocation.getWorld().spawnEntity(spawnLocation, EntityType.CREEPER);

            // this is some serious trolling
            creeper.setPowered(true);
            creeper.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2, false, false));
        }
    }
}
