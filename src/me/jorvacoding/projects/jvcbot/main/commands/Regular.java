package me.jorvacoding.projects.jvcbot.main.commands;

import me.jorvacoding.projects.jvcbot.main.Info;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;

public class Regular extends Command {

	public Regular() {
		super("moderator", Permission.BROADCASTER);
	}
	
	@Override
	public void execute(String sender, String[] args) {
		System.out.println("Executing " + getName());
		Info.perms.put(args[1], Permission.REG);
		Info.bot.msg("Added " + args + " to Regular.");
	}

}
