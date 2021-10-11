import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestsMain {
    public void getFiles(){
        assertEquals(10, Main.getFiles().length);
        assertEquals(new File("src/patterns/Adapter"), Main.getFiles()[0]);
    }

    public void getPatternTest() throws IOException {
        File[] files = {new File("src/patterns/Adapter")};
        assertEquals(485, Main.getPattern(files, 0).length());
        assertEquals("class PBank {\n", Main.getPattern(files, 0).substring(0, 14));

    }
    @Test
    public void UserInput() throws IOException {
        String[] args = {};
        InputStream in = new ByteArrayInputStream("sdfgjkhgew\n1\n2\n3\n4\nn".getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));



        try {
            Main.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertThat(outContent.toString(), containsString("Неправильный ввод попробуйте еще раз!"));
        assertThat(outContent.toString(), containsString("Да, это правильный ответ!"));
        assertThat(outContent.toString(), containsString("Спасибо за игру!"));
    }

}
