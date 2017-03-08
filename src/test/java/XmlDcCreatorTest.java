import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertFalse;

public class XmlDcCreatorTest {
    @Test
    public void testDocNotExist() {
        String testedFile = "/junittTest.xml";
        assertFalse(Files.exists(Paths.get(testedFile)));
    }
}


