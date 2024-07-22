package io.github.vitelotte.nonexplosiveterrain.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionListener implements Listener {
    @EventHandler
    public void onExplodeEntity(EntityExplodeEvent e) {
        e.blockList().clear();
    }

    @EventHandler
    public void onExplodeBlock(BlockExplodeEvent e) {
        e.blockList().clear();
    }
}
