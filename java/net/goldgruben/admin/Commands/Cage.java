package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Config;
import net.goldgruben.admin.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cage implements CommandExecutor {

    boolean active = false;

    public Cage(){
        if (Config.contains("command.cage.active")){
        }else {
            Config.set("command.cage.active", false);
        }



    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (active) {
            Player target = Bukkit.getServer().getPlayer(args[0]);
            World welt = target.getWorld();
            if (target == null) {

                sender.sendMessage("Spieler ist nicht in deiner Macht");

            } else {

                int posZ = target.getLocation().getBlockZ();
                int posY = target.getLocation().getBlockY();
                int posX = target.getLocation().getBlockX();

                Location position = null;
                position.setY(posY - 1);
                position.setX(posX);
                position.setZ(posZ + 1);
                welt.getBlockAt(position).setType(Material.BEDROCK);

            }
        }else sender.sendMessage(Messages.notactive);


        return false;
    }
}