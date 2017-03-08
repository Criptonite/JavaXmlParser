package commands.mainmenu;

import commands.Command;
import utility.ConsoleHelper;
import utility.XmlDocManager;

import java.io.IOException;

public class NewFile implements Command {
    @Override
    public void execute() {
        try {
            String path = ConsoleHelper.readMessage();
            XmlDocManager.createXmlFile(path);
        } catch (IOException e) {
            ConsoleHelper.writelnMessage("Exception in NewFile: " + e.getMessage());
        }
    }
}
