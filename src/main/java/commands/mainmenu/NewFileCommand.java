package commands.mainmenu;

import commands.Command;
import exceptions.ExitException;
import utility.ConsoleHelper;
import utility.XmlDocManager;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class NewFileCommand implements Command {
    @Override
    public void execute() throws ExitException {
        String path = null;
        while (true) {
            try {
                ConsoleHelper.writelnMessage("===============");
                ConsoleHelper.writelnMessage("CREATE NEW FILE");
                ConsoleHelper.writelnMessage("===============");
                ConsoleHelper.writeMessage("Enter path to file here: ");
                path = ConsoleHelper.readMessage();
                if("exit".equalsIgnoreCase(path)) throw new ExitException();
                XmlDocManager.createXmlFile(path);
                ConsoleHelper.writelnMessage("Success!");
                break;
            } catch (FileAlreadyExistsException e) {
                ConsoleHelper.writelnMessage("File \"" + path + "\" already exists");
            } catch (IOException e) {
                ConsoleHelper.writelnMessage("Exception in NewFileCommand: " + e.getMessage());
            }
        }
    }
}
