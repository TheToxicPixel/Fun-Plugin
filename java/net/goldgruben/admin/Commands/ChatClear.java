package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Messages;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class ChatClear implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            if (sender instanceof ConsoleCommandSender) {

                sender.sendMessage(Messages.noplayer);
            } else if (sender instanceof Player) {

                Player p = (Player) sender;
                if (!p.hasPermission("")) {
                    p.sendMessage(Messages.nopermission);
                    return true;

                } else {
                    ChatClearSelf(p);

                }

            }


        return false;
    }

    public void ChatClearSelf(Player p){
        p.sendMessage(Messages.sucsess);
        for (int i = 1; i <= 100; i++){
            p.sendMessage("");
        }
        p.sendMessage(ChatColor.translateAlternateColorCodes( '&',Messages.sucsess));

    }






}
