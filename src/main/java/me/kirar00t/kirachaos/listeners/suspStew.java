package me.kirar00t.kirachaos.listeners;

// Bukkit imports
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;


public class suspStew implements Listener {
    @EventHandler
    public void onPlayerConsumeItem(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        Location location = player.getLocation();

        location.setY(location.getY() + 200);
        if (event.getItem().getType() == Material.SUSPICIOUS_STEW) {
            player.teleport(location);
        }
    }
}
