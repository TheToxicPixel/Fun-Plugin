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
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            Player target = Bukkit.getServer().getPlayer(args[1]);
            Player p = (Player) sender;
            String Block = args[0];
            Material Blockm = Material.valueOf(Block);
            String target0 = String.valueOf(target);

            if (target == null) {
                p.sendMessage(Messages.notonline);
            } else {
                target.getInventory().getHelmet().setType(Blockm);
                sender.sendMessage(target + "wurde" + Block + "aufgesetzt");
            }

            if (target0 == "") {
                p.getInventory().getHelmet().setType(Blockm);
                p.sendMessage("Du hast dir" + Block + "aufgesetzt");
            }
        return false;
    }
}