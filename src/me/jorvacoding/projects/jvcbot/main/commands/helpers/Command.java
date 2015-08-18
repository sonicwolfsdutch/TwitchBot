package me.jorvacoding.projects.jvcbot.main.commands.helpers;


public abstract class Command {
	
	public String name;
	public Permission perm;
	
	public Command(String name, Permission p){
		this.name = name;
		perm = p;
	}
	
	public String getName(){
		return name;
	}
	
	public Permission getPerm(){
		return perm;
	}
	
	public abstract void execute(String sender, String[] args);		
	
	public String addArgs(String[] args, String in, String sender){
		String out = in.replace("%user", sender);	
		for(int i = 0; i < 100; i++){
			if(i != 0)
				try{
				out = out.replace("%" +i, args[i]);
				}catch(ArrayIndexOutOfBoundsException e){}
		}
		return out;
	}
}
