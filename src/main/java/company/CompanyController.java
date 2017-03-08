package company;

import operations.ActionMenuOperation;
import utility.ConsoleHelper;
import utility.XmlHandleManager;

public class CompanyController {
    private static XmlHandleManager xmlHandleManager = XmlHandleManager.getInstance();

    public static void main(String[] args) {
        ActionMenuOperation actionMenuOperation = null;
        ConsoleHelper.writelnMessage("Hello...");
        do {
            ConsoleHelper.printMenu();
            actionMenuOperation = ActionMenuOperation.EXIT;
        } while (actionMenuOperation != ActionMenuOperation.EXIT);
        ConsoleHelper.writelnMessage("");
        ConsoleHelper.writelnMessage("Goodbye...");
    }
}
