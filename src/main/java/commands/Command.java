package commands;

import exceptions.ExitException;

public interface Command {
    void execute() throws ExitException;
}
