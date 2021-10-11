import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class TestsMain {
    @Test
    public void getFiles(){
        assertEquals(10, Main.getFiles().length);
        assertEquals(new File("src/patterns/Adapter"), Main.getFiles()[0]);
    }
}
