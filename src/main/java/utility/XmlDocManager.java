package utility;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlDocManager {
    public static void createXmlFile(String path) throws IOException {
        if (Files.exists(Paths.get(path))) {
            throw new FileAlreadyExistsException(path);
        } else {
            Files.createFile(Paths.get(path + ".xml"));
        }
        try (BufferedWriter toXmlFile = Files.newBufferedWriter(Paths.get(path + ".xml"))) {
            toXmlFile.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<organization></organization>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void openXmlFile(String path) throws FileAlreadyExistsException {
        if (Files.exists(Paths.get(path))) {
            throw new FileAlreadyExistsException(path);
        }
    }
}

