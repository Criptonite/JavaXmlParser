package commands.mainmenu;

import commands.Command;
import utility.ConsoleHelper;
import utility.XmlDocManager;

import java.io.IOException;

public class NewFileCommand implements Command {
    @Override
    public void execute() {
        try {
            ConsoleHelper.writelnMessage("==============================================");
            ConsoleHelper.writelnMessage("\t\tCREATE NEW FILE");
            ConsoleHelper.writelnMessage("==============================================");
            ConsoleHelper.writeMessage("Enter path to file here: ");
            String path = ConsoleHelper.readMessage();
            XmlDocManager.createXmlFile(path);
            ConsoleHelper.writelnMessage("Success!");
        } catch (IOException e) {
            ConsoleHelper.writelnMessage("Exception in NewFileCommand: " + e.getMessage());
        }
    }
}
