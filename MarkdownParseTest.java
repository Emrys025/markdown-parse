import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFileTest() throws IOException{
        assertEquals(List.of("https://something.com","some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void imageTest() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("imageTest.md"))));
    }

    @Test
    public void handlingEntersTest() throws IOException{
        assertEquals(List.of("cat"), MarkdownParse.getLinks(Files.readString(Path.of("handlingEnters.md"))));
    }

    @Test
    public void noLinkFileTest() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("noLinkFile.md"))));
    }
}

