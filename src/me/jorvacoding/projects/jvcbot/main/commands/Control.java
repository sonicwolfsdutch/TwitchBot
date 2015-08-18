package me.jorvacoding.projects.jvcbot.main.commands;

import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;

public class Control extends Command{

	public Control() {
		super("bot", Permission.BROADCASTER);
	}

	/**
	 * args:
	 * String sender - who sent it
	 * String[] Args = {
	 * 		name
	 * 		cmd
	 */
	@Override
	public void execute(String sender, String[] args) {
		
	}

}
