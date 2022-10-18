package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Messages;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class Gamemode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (! (sender instanceof Player)) {

            sender.sendMessage(Messages.noplayer);
        }
        Player p = (Player) sender;
        switch (command.getName().toLowerCase(Locale.ROOT)){

            case "c":
                if (!(p.getGameMode() == GameMode.CREATIVE)){

                    p.setGameMode(GameMode.CREATIVE);

                }else {

                    p.sendMessage("Du bist schon göttlich");
                }
                break;
            case "s":
                if (!(p.getGameMode()==GameMode.SURVIVAL)){

                    p.setGameMode(GameMode.SURVIVAL);

                }else{
                    p.sendMessage("Du bist schon schwach");
                }
                break;
            default:
                break;
        }



        return false;
    }
}
