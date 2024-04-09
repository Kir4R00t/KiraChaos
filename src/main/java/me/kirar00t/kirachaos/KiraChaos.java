package me.kirar00t.kirachaos;

import me.kirar00t.kirachaos.listeners.cowBreeding;
import me.kirar00t.kirachaos.listeners.explodingSnowballs;
import me.kirar00t.kirachaos.listeners.suspStew;
import me.kirar00t.kirachaos.listeners.villagerDeath;
import org.bukkit.plugin.java.JavaPlugin;

public final class KiraChaos extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            System.out.println("KiraChaos plugin loaded successfully !");

            // Register listeners
            getServer().getPluginManager().registerEvents(new explodingSnowballs(), this);
            getServer().getPluginManager().registerEvents(new suspStew(), this);
            getServer().getPluginManager().registerEvents(new villagerDeath(), this);
            getServer().getPluginManager().registerEvents(new cowBreeding(), this);

        } catch (Exception e) {
            System.out.println("KiraChaos plugin has failed to load");
        }
    }

    @Override
    public void onDisable() {
        System.out.println("Kira Chaos plugin has been disabled !");
    }
}
