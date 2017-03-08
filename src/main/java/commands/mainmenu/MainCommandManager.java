package commands.mainmenu;

import commands.Command;
import operations.MainMenuOpperation;

import java.util.HashMap;
import java.util.Map;

public final class MainCommandManager {
    private static Map<MainMenuOpperation, Command> operationStorage = new HashMap<MainMenuOpperation, Command>();

    private MainCommandManager() {
    }

    static {
        operationStorage.put(MainMenuOpperation.OPEN_FILE, new OpenFile());
        operationStorage.put(MainMenuOpperation.NEW_FILE, new NewFile());

    }


    public static void executeCommand(MainMenuOpperation actionMenuOperation) {
        operationStorage.get(actionMenuOperation).execute();
    }
}
