package ua.univer.vehicle;

import ua.univer.vehicle.commands.Command;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void run() {
		this.command.execute();
	}
}
