package net.goldgruben.admin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Nick implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        p.getDisplayName();
        if (args[0] != "") {
            p.setDisplayName(args[0]);
        }else {
            p.sendMessage("Du musst etwas nennen");
        }
        return false;
    }
}
