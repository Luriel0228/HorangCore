package com.github.luriel0228.horangcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class HorangCore extends JavaPlugin {

    public static HorangCore instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("HorangCore is enabled!");
    }

    public static HorangCore getInstance() {
        return instance;
    }

}
