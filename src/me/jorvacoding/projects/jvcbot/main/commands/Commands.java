package me.jorvacoding.projects.jvcbot.main.commands;

import me.jorvacoding.projects.jvcbot.main.Info;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;

public class Commands  extends Command {

	public Commands() {
		super("commands", Permission.REG);
	}
	
	@Override
	public void execute(String sender, String args[]) {
		System.out.println("Executing " + getName());
		String out = "The commands for this channel are: ";
		for(Command c : Info.Commands){
			out = out + c.getName() + ", ";
		}
		Info.bot.msg(out);
	}
}
