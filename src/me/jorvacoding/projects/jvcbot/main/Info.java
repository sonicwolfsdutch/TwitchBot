package me.jorvacoding.projects.jvcbot.main;

import java.util.HashMap;

import me.jorvacoding.projects.jvcbot.main.commands.*;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;

public class Info {
	public static String name, oauth, channel;
	public static Bot bot;
	public static final String prefix = "<";
	
	public static boolean isRunning;
	public static boolean isIdle;

	public static HashMap<String, Permission> perms = new HashMap<String, Permission>();
	public static final Permission[] iPerms = {Permission.ALL,Permission.BROADCASTER,Permission.MOD,Permission.OWNER,Permission.REG};

	public static boolean hasPerm(String name, Permission p) {
		try {
			if (perms.get(name).getValue() >= p.getValue())
				return true;
		} catch (Exception e) {
			System.out.println("User perm not found! Error thrown!");
		}
		return false;
	}

	public static Command[] Commands = new Command[] {new EditPerm(), new PrintPerms(), new Purge(), new Commands()};
}
