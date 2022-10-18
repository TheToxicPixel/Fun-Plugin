package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Messages;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;

            if (p.getHealth() != 20 ) {

                p.setHealth(20);
                p.sendMessage(ChatColor.GREEN + "healed");

            }else p.sendMessage("Du hast schon Herzen wie ein Gott");



        }else {

            sender.sendMessage(Messages.noplayer);

        }




        return false;
    }
}
