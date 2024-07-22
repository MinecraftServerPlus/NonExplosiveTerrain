package io.github.vitelotte.nonexplosiveterrain;

import io.github.vitelotte.nonexplosiveterrain.listeners.ExplosionListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NonExplosiveTerrain extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExplosionListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
