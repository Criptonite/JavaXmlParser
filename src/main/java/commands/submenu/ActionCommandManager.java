package commands.submenu;

import commands.Command;
import exceptions.ExitException;
import operations.ActionMenuOperation;

import java.util.HashMap;
import java.util.Map;

public final class ActionCommandManager {
    private static Map<ActionMenuOperation, Command> operationStorage = new HashMap<ActionMenuOperation, Command>();

    private ActionCommandManager() {
    }

    static {
        operationStorage.put(ActionMenuOperation.ADD, new AddCommand());
        operationStorage.put(ActionMenuOperation.INFO, new InfoCommand());
        operationStorage.put(ActionMenuOperation.REMOVE, new RemoveCommand());
        operationStorage.put(ActionMenuOperation.UPDATE, new UpdateCommand());
        operationStorage.put(ActionMenuOperation.TO_MAIN_MENU, new ToMainMenuCommand());
        operationStorage.put(ActionMenuOperation.EXIT, new ExitCommand());
    }


    public static void executeCommand(ActionMenuOperation actionMenuOperation) throws ExitException {
        operationStorage.get(actionMenuOperation).execute();
    }
}
