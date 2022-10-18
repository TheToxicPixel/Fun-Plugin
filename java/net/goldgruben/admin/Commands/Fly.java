package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Config;
import net.goldgruben.admin.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    boolean active = false;
    public Fly(){
        if (Config.contains("command.fly.active")){

        }else {
            Config.set("command.fly.active", false);
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (active) {
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

                sender.sendMessage("Spieler ist nicht in deiner Macht");

            } else {
                if (target.getAllowFlight() == true) {

                    sender.sendMessage("Der Spieler ist schon Gott gleich");

                }
                target.setAllowFlight(true);
            }
        }else sender.sendMessage(Messages.notactive);

        return false;
    }
}
