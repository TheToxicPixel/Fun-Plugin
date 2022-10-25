package net.goldgruben.admin.Commands;

import net.goldgruben.admin.utils.Config;
import net.goldgruben.admin.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Backpack implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            p.openInventory(inventory);

        } else {
            sender.sendMessage(Messages.noplayer);
        }
        return false;
    }

    private Inventory inventory;

    public Backpack (){

        {
            int slots = 27;
            if (Config.contains("backpack.command.slots")) {

                slots = (int) Config.get("backpack.command.slots");
            }
            this.inventory = Bukkit.createInventory(null, slots, "Backpack");
        }
    }
}