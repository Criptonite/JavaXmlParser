package commands;

import operations.Operation;

import java.util.HashMap;
import java.util.Map;

public final class CommandManager {
    private static Map<Operation, Command> operationStorage = new HashMap<Operation, Command>();

    private CommandManager() {
    }

    static {
        operationStorage.put(Operation.ADD, new AddCommand());
        operationStorage.put(Operation.INFO, new InfoCommand());
        operationStorage.put(Operation.REMOVE, new RemoveCommand());
        operationStorage.put(Operation.UPDATE, new UpdateCommand());
    }


    public static void executeCommand(Operation operation) {
        operationStorage.get(operation).execute();
    }
}
