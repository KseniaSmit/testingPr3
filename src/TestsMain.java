import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestsMain {
    public void getFiles(){
        assertEquals(10, Main.getFiles().length);
        assertEquals(new File("src/patterns/Adapter"), Main.getFiles()[0]);
    }

    @Test
    public void getPatternTest() throws IOException {
        File[] files = {new File("src/patterns/Adapter")};
        assertEquals(485, Main.getPattern(files, 0).length());
        assertEquals("class PBank {\n", Main.getPattern(files, 0).substring(0, 14));

    }
}
