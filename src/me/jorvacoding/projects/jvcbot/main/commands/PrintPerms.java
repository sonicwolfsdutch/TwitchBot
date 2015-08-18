package me.jorvacoding.projects.jvcbot.main.commands;

import me.jorvacoding.projects.jvcbot.main.Info;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;

public class PrintPerms extends Command {

	public PrintPerms() {
		super("perms", Permission.BROADCASTER);
	}
	
	@Override
	public void execute(String message, String[] args) {
		System.out.println("Executing " + this.getName());
		Info.bot.msg(Info.perms.toString());
	}
	

}
