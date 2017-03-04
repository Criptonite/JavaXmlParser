package company;

import operations.Operation;
import utility.ConsoleHelper;
import utility.XmlHandleManager;

public class CompanyController {
    private static XmlHandleManager xmlHandleManager = XmlHandleManager.getInstance();

    public static void main(String[] args) {
        Operation operation = null;
        ConsoleHelper.writelnMessage("Hello...");
        do {
            ConsoleHelper.printMenu();
            operation = Operation.EXIT;
        } while (operation != Operation.EXIT);
        ConsoleHelper.writelnMessage("");
        ConsoleHelper.writelnMessage("Goodbye...");
    }
}
