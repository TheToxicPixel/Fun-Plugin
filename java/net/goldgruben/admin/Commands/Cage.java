package net.goldgruben.admin.Commands;

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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = Bukkit.getServer().getPlayer(args[0]);
        World welt = target.getWorld();
        if (target == null) {

            sender.sendMessage(Messages.notonline);

            } else {
                double posZ = target.getLocation().getBlockZ();
                double posY = target.getLocation().getBlockY();
                double posX = target.getLocation().getBlockX();

                Location position = null;
                position.setY(posY - 1);
                position.setX(posX);
                position.setZ(posZ + 1);
                welt.getBlockAt(position).setType(Material.BEDROCK);
        }


        return false;
    }
}