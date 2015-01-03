package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "Request OP", usage = "/<command>")
public class Command_relogger extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        for (Player p : Bukkit.getOnlinePlayers())
        {
            TFM_Util.bcastMsg("All admins will be right back-they just have to relog after this reload.", ChatColor.RED);
            if (TFM_AdminList.isSuperAdmin(p))
            {
                p.kickPlayer(ChatColor.RED + "Please relog into the server for admin changes to take effect.");
            }
        }

        return true;
    }
}