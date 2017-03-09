package commands.mainmenu;

import commands.Command;
import commands.ExitCommand;
import exceptions.ExitException;
import operations.MainMenuOpperation;

import java.util.HashMap;
import java.util.Map;

public final class MainCommandManager {
    private static Map<MainMenuOpperation, Command> operationStorage = new HashMap<>();

    private MainCommandManager() {
    }

    static {
        operationStorage.put(MainMenuOpperation.OPEN_FILE, new OpenFileCommand());
        operationStorage.put(MainMenuOpperation.NEW_FILE, new NewFileCommand());
        operationStorage.put(MainMenuOpperation.EXIT, new ExitCommand());

    }


    public static void executeCommand(MainMenuOpperation actionMenuOperation) throws ExitException {
        operationStorage.get(actionMenuOperation).execute();
    }
}
