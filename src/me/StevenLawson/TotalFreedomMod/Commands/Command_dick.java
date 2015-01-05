package me.StevenLawson.TotalFreedomMod.Commands;

import java.util.Arrays;
import java.util.List;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Gives the player a cock to suck.", usage = "/<command> [player]")
public class Command_dick extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
                if (args.length != 1)
        {
            return false;
        }

        final Player player = getPlayer(args[0]);

        if (player == null)
        {
            sender.sendMessage(TotalFreedomMod.PLAYER_NOT_FOUND);
            return true;
        }
        Player p;
        p = getPlayer(args[1]);
        TFM_Util.bcastMsg(p.getName() + " is being a dick head.", ChatColor.RED);
        p.sendMessage(ChatColor.RED + "What the hell are you doing you stupid dick?");
        p.sendMessage(ChatColor.RED + "Have a cock to suck.");
        TFM_Util.asciiDick();
        Location l = p.getLocation();
        for (int x = -1; x <= 1; x++) {
          for (int z = -1; z <= 1; z++)
          {
            Location strikePos = new Location(l.getWorld(), l.getBlockX() + x, l.getBlockY(), l.getBlockZ() + z);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
            l.getWorld().strikeLightning(strikePos);
          }
        }
        p.setHealth(0.0D);
    return true;
}
}
