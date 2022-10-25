package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Config;
import net.goldgruben.admin.utils.Messages;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            ItemStack Feed = new ItemStack(Material.COOKED_BEEF);
            Feed.setAmount(64);
            Player p = (Player) sender;

            if (sender instanceof Player) {

                p.setFoodLevel(20);
                p.getInventory().addItem(Feed);
                p.sendMessage("Items added");

            } else {

                sender.sendMessage(Messages.noplayer);

            }

        return false;
    }
}
