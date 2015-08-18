package me.jorvacoding.projects.jvcbot.main.commands;

import me.jorvacoding.projects.jvcbot.main.Info;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;

public class Purge extends Command {

	public Purge() {
		super("purge", Permission.MOD);
	}
	
	@Override
	public void execute(String sender, String[] args) {
		System.out.println("Executing " + getName());
		Info.bot.msg(".timeout " + args[1] + " 1");
	}

}
