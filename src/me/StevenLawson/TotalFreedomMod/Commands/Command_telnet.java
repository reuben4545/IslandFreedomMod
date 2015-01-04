package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "Disables telnet in a single command.", usage = "/<command>")
public class Command_telnet extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if(TFM_Util.imposters.contains(sender_p.getName()))
        {   
            server.dispatchCommand(sender, "plugincontrol enable BukkitTelnet");
        TFM_Util.adminAction(sender.getName(), "Enabling the telnet client for all admins", true);
        }
        else
        {
            server.dispatchCommand(sender, "plugincontrol disable BukkitTelnet");
            TFM_Util.adminAction(sender.getName(), "Disabling the telnet client for all admins", true);
        }
        return true;
    }
    
}
