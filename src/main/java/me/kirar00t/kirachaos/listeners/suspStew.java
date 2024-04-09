package me.kirar00t.kirachaos.listeners;

// Bukkit imports
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
        World world = player.getWorld();
        if (event.getItem().getType() == Material.SUSPICIOUS_STEW) {
            world.setTime(13000);
        }
    }
}
