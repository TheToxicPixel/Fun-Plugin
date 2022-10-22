package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Scare implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player target = Bukkit.getServer().getPlayer(args[0]);

        if (target == null){

            sender.sendMessage(Messages.notonline);
            return true;

        }

        Sound sound = null;
        for (Sound s :Sound.values()){
            if (s.toString().contains(args[1])){

                sound = s;


            }

            else {

                sender.sendMessage("Sound not found");

                return true;
            }

        }
        String svol =args[2]+"F";
        int volume = Integer.parseInt(svol);
        String spitch = args[3]+"F";
        int pitch = Integer.parseInt(spitch);

        target.playSound(target.getLocation(),sound,volume,pitch);


        return false;
    }
}
