package me.jorvacoding.projects.jvcbot.main.commands;

import me.jorvacoding.projects.jvcbot.main.Info;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Command;
import me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission;
import static me.jorvacoding.projects.jvcbot.main.commands.helpers.Permission.*;
import static me.jorvacoding.projects.jvcbot.main.Info.hasPerm;

public class EditPerm extends Command {

	public EditPerm() {
		super("editperm", MOD);
	}
	
	@Override
	public void execute(String sender, String args[]) {
		System.out.println("Executing " + getName());
		Permission p = null;
		for(Permission in : Info.iPerms)
			if(args[2].equalsIgnoreCase(in.toString())) p = in;
		if(p != null){
			if(p == BROADCASTER && hasPerm(sender, OWNER)){
				Info.perms.put(args[1], p);
			}
		}
	}
	
}
