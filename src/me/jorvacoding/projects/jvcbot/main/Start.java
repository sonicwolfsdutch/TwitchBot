package me.jorvacoding.projects.jvcbot.main;

import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;


public class Start {
	public static void main(String[] args) {
		setInfo();
		setPerms();
		Info.bot = new Bot();
		//Info.bot.msg("Heyoo! I'm alive. I'm totally NOT a bot or anything.");
	}

	public static void setInfo() {
		Info.channel = "";
		Info.name = "";
		Info.oauth = "";
	}

	public static void setPerms() {
		Info.perms.put("Jordancfi".toLowerCase(), Permission.OWNER);
		Info.perms.put("EwyBoy".toLowerCase(), Permission.BROADCASTER);
		Info.perms.put("RushMead".toLowerCase(), Permission.MOD);
		Info.perms.put("FluidGamingLive".toLowerCase(), Permission.MOD);
		Info.perms.put("Sonirc".toLowerCase(), Permission.REG);
		Info.perms.put("Blucid".toLowerCase(), Permission.REG);
	}
}
