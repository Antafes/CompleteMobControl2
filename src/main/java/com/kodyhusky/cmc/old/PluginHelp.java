package com.kodyhusky.cmc.old;

import java.text.MessageFormat;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class PluginHelp {

    CommandSender sender;
    CompleteMobControl plugin;

    public PluginHelp(CompleteMobControl plugin) {
        this.plugin = plugin;
    }

    public void showPage(int n, CommandSender sender) {
        this.sender = sender;
        switch (n) {
        case 1: {
            page1();
            break;
        }
        case 2: {
            page2();
            break;
        }
        case 3: {
            page3();
            break;
        }
        default: {
            page1();
            break;
        }
        }
    }

    public void page1() {
        plugin.sM(sender, MessageFormat.format("{0}-- {1}{2} {0}--", ChatColor.YELLOW, ChatColor.GOLD,
                plugin.getLang().get("help_p1_1")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/cmc help{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p1_2")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/cmc reload{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p1_3")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/cmc giants{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p1_4")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/cmc version{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p1_5")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/cmc help {1}2{0}: {2}", ChatColor.GOLD, ChatColor.RED,
                plugin.getLang().get("help_next")), "non");
    }

    public void page2() {
        plugin.sM(sender, MessageFormat.format("{0}-- {1}{2} {0}--", ChatColor.YELLOW, ChatColor.GOLD,
                plugin.getLang().get("help_p2_1")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/erepel create{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p2_2")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/erepel list{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p2_3")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/erepel modify{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p2_4")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/erepel remove{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p2_5")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/erepel removeall{1}: {2}", ChatColor.GREEN, ChatColor.WHITE,
                plugin.getLang().get("help_p2_6")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/cmc help {1}3{0}: {2}", ChatColor.GOLD, ChatColor.RED,
                plugin.getLang().get("help_next")), "non");
    }

    public void page3() {
        plugin.sM(sender, MessageFormat.format("{0}-- {1}{2} {0}--", ChatColor.YELLOW, ChatColor.GOLD,
                plugin.getLang().get("help_p3_1")), "non");
        plugin.sM(sender, MessageFormat.format("{0}/cmc help {1}1{0}: {2}", ChatColor.GOLD, ChatColor.RED,
                plugin.getLang().get("help_first")), "non");
    }
}
