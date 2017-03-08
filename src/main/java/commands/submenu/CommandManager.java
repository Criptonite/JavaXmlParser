package commands.submenu;

import commands.Command;
import operations.ActionMenuOperation;

import java.util.HashMap;
import java.util.Map;

public final class CommandManager {
    private static Map<ActionMenuOperation, Command> operationStorage = new HashMap<ActionMenuOperation, Command>();

    private CommandManager() {
    }

    static {
        operationStorage.put(ActionMenuOperation.ADD, new AddCommand());
        operationStorage.put(ActionMenuOperation.INFO, new InfoCommand());
        operationStorage.put(ActionMenuOperation.REMOVE, new RemoveCommand());
        operationStorage.put(ActionMenuOperation.UPDATE, new UpdateCommand());
        operationStorage.put(ActionMenuOperation.EXIT, new ExitCommand());
    }


    public static void executeCommand(ActionMenuOperation actionMenuOperation) {
        operationStorage.get(actionMenuOperation).execute();
    }
}
