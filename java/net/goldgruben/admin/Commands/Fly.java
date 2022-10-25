package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Config;
import net.goldgruben.admin.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (sender instanceof Player) {

                Player p = (Player) sender;


                if (p.getAllowFlight()) {

                    p.sendMessage("Du bist schon Gott");

                } else {

                    p.setAllowFlight(true);
                    p.sendMessage("Du wurdest göttlich");

                }

            } else {
                sender.sendMessage(Messages.noplayer);
            }


            Player target = Bukkit.getServer().getPlayer(args[0]);
            if (target == null) {

                sender.sendMessage(Messages.notonline);

            } else {
                if (target.getAllowFlight() == true) {

                    sender.sendMessage("Der Spieler ist schon Gott gleich");

                }
                target.setAllowFlight(true);
            }


        return false;
    }
}
