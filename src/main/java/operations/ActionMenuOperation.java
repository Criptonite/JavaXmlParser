package operations;

import exceptions.InvalidInputException;

public enum ActionMenuOperation {
    ADD,
    INFO,
    REMOVE,
    UPDATE,
    TO_MAIN_MENU,
    EXIT;

    public static ActionMenuOperation get(String name) throws InvalidInputException {
        switch (name.toUpperCase()) {
            case "ADD":
                return ADD;
            case "INFO":
                return INFO;
            case "REMOVE":
                return REMOVE;
            case "UPDATE":
                return UPDATE;
            case "BACK":
                return TO_MAIN_MENU;
            case "EXIT":
                return EXIT;
            default:
                throw new InvalidInputException();
        }
    }
}
