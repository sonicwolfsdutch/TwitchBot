package me.jorvacoding.projects.jvcbot.main;

import me.jorvacoding.projects.jvcbot.main.commands.Control;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;

import org.jibble.pircbot.PircBot;

public class Bot extends PircBot {

	public String channel;

	public Bot() {
		channel = toChannel(Info.channel);

		setVerbose(true);

		setName(Info.name);

		// connect
		System.out.println("Attemping to connect to twitch.");

		try {
			connect("irc.twitch.tv", 6667, Info.oauth);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Connected to twitch.");

		// Channel
		System.out.println("Attempting to connect to channel: " + this.channel);
		joinChannel(this.channel);
		if (isConnected()) {
			System.out.println("Connected to channel: " + this.channel);
		} else {
			System.out.println("Error connecting to channel");
		}

	}

	@Override
	protected void onMessage(String channel, String sender, String login,
			String hostname, String message) {

		if(Info.isRunning){
			
			//Fall back, If player doesnt have ANY perms, give them perms for "ALL" (anybody)... Stops errors in console
			//Check the perm table, if the player isnt in it, put them in basic...
			//DOES NOT SAVE! (uses more ram, but no point in keeping everyperson who types in chat in a file)
			if(!Info.hasPerm(sender, Permission.ALL)) Info.perms.put(sender, Permission.ALL);
			
			if(!Info.isIdle){
				for (Command c : Info.Commands) {
					if(message.toLowerCase().startsWith(Info.prefix + c.getName().toLowerCase()))
						if(Info.hasPerm(sender, c.getPerm()))
							if(!Info.isIdle)
								c.execute(sender, message.split(" "));
							else
								if(c.getName().equalsIgnoreCase("bot"))
									c.execute(sender, message.split(" "));
				}
			}
		}//is running
		super.onMessage(channel, sender, login, hostname, message);
	}

	public void msg(String msg) {
		sendMessage(channel, msg);
	}
	
	public boolean chatToPerm(String user){
		
		if(!Info.hasPerm(user, Permission.ALL)){
			
		}
		return false;
	}

	public String toChannel(String c) {
		String ch = c.toLowerCase();

		if (ch.startsWith("#"))
			return ch;
		return "#" + ch;
	}
}
