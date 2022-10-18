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

    boolean active = false;

    public Feed() {
        if (Config.contains("command.feed.active")){
    }else {
            Config.set("command.feed.active", false);
        }

    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (active) {
            ItemStack Feed = new ItemStack(Material.COOKED_BEEF);
            Feed.setAmount(64);

            if (sender instanceof Player) {

                Player p = (Player) sender;

                p.getInventory().addItem(Feed);
                p.sendMessage("Items added");

            } else {

                sender.sendMessage(Messages.noplayer);

            }
        }else sender.sendMessage(Messages.notactive);
        return false;
    }
}
