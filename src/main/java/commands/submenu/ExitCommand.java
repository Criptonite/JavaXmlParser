package commands.submenu;

import commands.Command;
import exceptions.ExitException;

public class ExitCommand implements Command {
    public void execute() throws ExitException {
        throw  new ExitException();
    }
}
