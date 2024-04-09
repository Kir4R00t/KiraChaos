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

/*




    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (event.getBlock().getType() == Material.OXEYE_DAISY) {
            regrowFlower(event.getBlock().getLocation());
            rotatePlayer180(player);
        }
    }

    private void regrowFlower(Location location) {
        location.getBlock().setType(Material.OXEYE_DAISY);
    }



    private void rotatePlayer180(Player player) {
        Location playerLocation = player.getLocation();
        Vector direction = playerLocation.getDirection();
        direction.multiply(-1);
        Location newLocation = playerLocation.clone().setDirection(direction);
        player.teleport(newLocation);
    }

 */