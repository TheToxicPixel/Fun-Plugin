package net.goldgruben.admin.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player p = event.getPlayer();

        if(p.isOp()){

            p.sendMessage(ChatColor.YELLOW + "Du bist als Gott beigetreten!");

        }else {

            p.sendMessage(ChatColor.BLUE + "Du bist als Spieler beigetreten");

        }



    }
}
