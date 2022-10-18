package net.goldgruben.admin.Listener;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

public class Bucket implements EventListener, Listener {


    @EventHandler(ignoreCancelled = true)
    public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) throws InterruptedException {

        Player p = event.getPlayer();
        p.sendMessage("Der Eimer ist jetzt wie dein Kopf");
        TimeUnit.SECONDS.sleep(1);
        p.sendMessage("Leer (;");

    }
}
