package com.miaoyww.ready;

import com.miaoyww.ready.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.miaoyww.ready.commands.ReadyCommandExecutor;


public final class Ready extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("ready").setExecutor(new ReadyCommandExecutor());
        getServer().getPluginManager().registerEvents(new Listener(), this);
        TeamManager.setPlugin(this);
        TeamManager.startActionBarUpdater();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    // 添加玩家到已准备的队伍
}
