package me.dreamvoid.template;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    public static YamlConfiguration config;

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        saveDefaultConfig(); // 加载配置文件
        getCommand("some-command").setExecutor(this); // 注册插件命令
    }

    @Override
    public void onDisable() {

    }

    private void LoadConfig() {
        
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return super.onCommand(sender, command, label, args);
    }
}
