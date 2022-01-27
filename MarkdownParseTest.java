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

    @Test
    public void testFile2Test() throws IOException{
        assertEquals(List.of("https://something.com","some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));
    }

    @Test
    public void testFile3Test() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    }

    @Test
    public void testFile4Test() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    }

    @Test
    public void testFile5Test() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    }

    @Test
    public void testFile6Test() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
    }

    @Test
    public void testFile7Test() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
    }

    @Test
    public void testFile8Test() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
    }

}

