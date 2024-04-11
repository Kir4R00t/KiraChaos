package me.kirar00t.kirachaos.listeners;

// Bukkit imports
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class explodingSnowballs implements Listener {
    @EventHandler
    public void onSnowballHit(ProjectileHitEvent event) {
        if (event.getEntityType() == EntityType.SNOWBALL) {
            Snowball snowball = (Snowball) event.getEntity();
            // Explosion power 4.0 is equivalent of 1 TNT
            snowball.getWorld().createExplosion(snowball.getLocation(), 4.0F);
            snowball.remove();
        }
    }
}