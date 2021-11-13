package utils.var;

import de.chaos.mc.headplugin.HeadPlugin;

public class ConfigLoader {
    public ConfigLoader(Boolean loadConfig) {
        if (loadConfig) {
            Var.Prefix = HeadPlugin.getPlugin().getConfig().getString("Config.Prefix");
            Var.permission = HeadPlugin.getPlugin().getConfig().getString("Config.Permission");
            Var.permissionmessage = HeadPlugin.getPlugin().getConfig().getString("Config.Permission-Message");
            Var.permissionstatus = Boolean.valueOf(HeadPlugin.getPlugin().getConfig().getBoolean("Config.permission-active"));
        }
    }
}
