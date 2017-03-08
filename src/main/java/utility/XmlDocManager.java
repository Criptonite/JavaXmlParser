package utility;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlDocManager {
    public static void createXmlFile(String path) throws FileAlreadyExistsException {
        ConsoleHelper.writeMessage("Enter filename, please:\t");
        try {
            if (!Files.exists(Paths.get(path))) {
                Files.createFile(Paths.get(path));
                XmlHandleManager.getInstance().createBase(Paths.get(path));
            } else throw new FileAlreadyExistsException(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

