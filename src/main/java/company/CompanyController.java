package company;

import commands.mainmenu.MainCommandManager;
import commands.submenu.ActionCommandManager;
import exceptions.ExitException;
import exceptions.InvalidInputException;
import operations.ActionMenuOperation;
import operations.MainMenuOpperation;
import utility.ConsoleHelper;
import utility.XmlHandleManager;

import java.io.IOException;

public class CompanyController {
    private static XmlHandleManager xmlHandleManager = XmlHandleManager.getInstance();

    public static void main(String[] args) throws IOException {
        ActionMenuOperation actionMenuOperation = null;
        MainMenuOpperation mainMenuOpperation = null;
        ConsoleHelper.writelnMessage("Hello...");
        try {
            while (true) {
                ConsoleHelper.printMainMenu();
                try {
                    mainMenuOpperation = MainMenuOpperation.get(ConsoleHelper.readMessage());
                } catch (InvalidInputException e) {
                    ConsoleHelper.writelnMessage("Invalid command! Please try again.");
                    continue;
                }
                MainCommandManager.executeCommand(mainMenuOpperation);
                while (mainMenuOpperation != MainMenuOpperation.TO_MAIN_MENU) {
                    ConsoleHelper.printSubMenu();
                    try {
                        actionMenuOperation = ActionMenuOperation.get(ConsoleHelper.readMessage());
                    } catch (InvalidInputException e) {
                        ConsoleHelper.writelnMessage("Invalid command! Please try again.");
                        continue;
                    }
                    ActionCommandManager.executeCommand(actionMenuOperation);
                }
            }
        } catch (ExitException e) {
            ConsoleHelper.writelnMessage("");
            ConsoleHelper.writelnMessage("Goodbye...");
        }
    }
}
