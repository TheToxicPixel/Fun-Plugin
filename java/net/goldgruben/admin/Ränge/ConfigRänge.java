package net.goldgruben.admin.Ränge;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissibleBase;
import org.bukkit.permissions.ServerOperator;

public class ConfigRänge extends PermissibleBase {
    private Player player;

    public ConfigRänge( Player player) {
        super(player);
        this.player = player;
    }
    @Override
    public boolean hasPermission(String inName){
        return super.hasPermission(inName);
    }
}
