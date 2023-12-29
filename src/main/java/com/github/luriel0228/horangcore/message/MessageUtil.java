package com.github.luriel0228.horangcore.message;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class MessageUtil {
    
    public static String color(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static void sendMessage(CommandSender sender, String msg) {
        sender.sendMessage(color(msg));
    }
    
}
