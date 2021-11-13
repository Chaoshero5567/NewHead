package commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import utils.ItemBuilder;
import utils.var.Var;

public class HeadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (Var.permissionstatus.booleanValue() == true) {
            if (!player.hasPermission(Var.permission)) {
                player.sendMessage(Var.permissionmessage);
                return true;
            }
            if (args.length == 1) {
                String target = args[0];
                player.getInventory().addItem(new ItemBuilder(Material.PLAYER_HEAD).skullOwner(target).itemStack());
                player.sendMessage(Var.Prefix + "Gave Head from: " + Bukkit.getPlayer(target).getDisplayName());
            }

            if (args.length == 0) {
                player.getInventory().addItem(new ItemBuilder(Material.PLAYER_HEAD).skullOwner(player.getName()).itemStack());
                player.sendMessage(Var.Prefix + "Gave Head from: " + player.getDisplayName());
                return true;
            }
        }
        return true;
    }
}
