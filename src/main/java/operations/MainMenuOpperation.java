package operations;

import exceptions.InvalidInputException;

public enum  MainMenuOpperation {
    OPEN_FILE,
    NEW_FILE,
    EXIT;

    public static MainMenuOpperation get(String name) throws InvalidInputException {
        switch (name.toUpperCase()){
            case "OPEN":
                return OPEN_FILE;
            case "NEW":
                return NEW_FILE;
            case "EXIT":
                return EXIT;
            default:
                throw new InvalidInputException();
        }
    }
}
