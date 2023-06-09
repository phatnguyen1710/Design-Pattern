package Chapter_06_COMMAND.JavaImp.Remote.commands.TV;

import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Command;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.TV;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}