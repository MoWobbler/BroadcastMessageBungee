package net.simpvp.BroadcastMessageBungee;


import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class BroadcastCommand extends Command {

    public BroadcastCommand() {
         super("broadcast");
    }

    public void execute(CommandSender sender, String[] args) {
    	
    	
    	if (args.length < 1) {
    		sender.sendMessage(new ComponentBuilder("/broadcast <message>").color(net.md_5.bungee.api.ChatColor.RED).create());
    		return;
    	}
    	
		String msg = "[Server] ";
		for (int i = 0;i<args.length;i++) 
			msg += args[i] + " ";
		
		
        for(ProxiedPlayer p: BungeeCord.getInstance().getPlayers()){
            p.sendMessage(new ComponentBuilder(msg).color(net.md_5.bungee.api.ChatColor.LIGHT_PURPLE).create());
        }
    }
}