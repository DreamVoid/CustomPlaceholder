package me.dreamvoid.customplaceholder;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class main extends JavaPlugin {

    @Override
    public void onLoad() {
        saveDefaultConfig(); // 加载配置文件
        new Placeholders(this).register();
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if(args.length>0){
            if(args[0].equalsIgnoreCase("reload")){
                reloadConfig();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.reload","&aPlugin config reloaded.")));
            } else sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.unknown","&cUnknown command, try /customplaceholder reload.")));
        } else sender.sendMessage("This server is running "+ getDescription().getName() +" version "+ getDescription().getVersion()+" by "+ getDescription().getAuthors().toString().replace("[","").replace("]",""));
        return false;
    }
}
