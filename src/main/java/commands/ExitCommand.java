package commands;

import exceptions.ExitException;

public class ExitCommand implements Command {
    public void execute() throws ExitException {
        throw  new ExitException();
    }
}
