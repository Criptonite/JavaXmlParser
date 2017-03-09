package commands.mainmenu;

import commands.Command;
import exceptions.ExitException;
import utility.ConsoleHelper;
import utility.XmlDocManager;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class OpenFileCommand implements Command {
    @Override
    public void execute() throws ExitException {
        String path = null;
        while (true) {
            try {
                ConsoleHelper.writelnMessage("");
                ConsoleHelper.writelnMessage("");
                ConsoleHelper.writelnMessage("===============");
                ConsoleHelper.writelnMessage("OPEN FILE");
                ConsoleHelper.writelnMessage("===============");
                ConsoleHelper.writeMessage("Enter path to file here: ");
                path = ConsoleHelper.readMessage();
                if ("exit".equalsIgnoreCase(path)) throw new ExitException();
                XmlDocManager.openXmlFile(path);
                ConsoleHelper.writelnMessage("Success!");
                break;
            } catch (NoSuchFileException e) {
                ConsoleHelper.writelnMessage("File \"" + path + "\" not exists. Try one more time please.");
            } catch (IOException e) {
                ConsoleHelper.writelnMessage("Exception in NewFileCommand: " + e.getMessage());
            }
        }
    }
}
