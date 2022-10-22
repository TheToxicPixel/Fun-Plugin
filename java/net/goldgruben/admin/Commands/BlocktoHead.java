package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Config;
import net.goldgruben.admin.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
public class BlocktoHead implements CommandExecutor {

    boolean active = false;

    public BlocktoHead() {
        if (Config.contains("command.blocktohead.active")) {

        } else {
            Config.set("command.blocktohead.achtive", false);
        }


    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (active) {

            Player target = Bukkit.getServer().getPlayer(args[1]);
            Player p = (Player) sender;
            boolean on = true;
            String Block = args[0];
            Material Blocke = Material.valueOf(Block);
            String target0 = String.valueOf(target);

            if (target == null) {
                p.sendMessage(Messages.notonline);

            } else {
                target.getInventory().getHelmet().setType(Blocke);
                sender.sendMessage(target + "wurde" + Block + "aufgesetzt");
            }

            if (target0 == "") {
                p.getInventory().getHelmet().setType(Blocke);
                p.sendMessage("Du hast dir" + Block + "aufgesetzt");
            }
        } else {
            sender.sendMessage(Messages.notactive);

        }

        return false;
    }
}