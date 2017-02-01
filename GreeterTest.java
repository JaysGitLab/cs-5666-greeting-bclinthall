import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
 * thanks to dfa at  http://stackoverflow.com/a/1119559
 */
public class GreeterTest{
    PrintStream origOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStream(){
        origOut = System.out;
        System.setOut(new PrintStream(outContent));
    }
    @After
    public void cleanUpStream(){
        System.setOut(origOut);
    }

    @Test
    public void outputsHello(){
        Greeter greeter = new Greeter();
        greeter.greet();
        assertEquals("failure, should be equal to \"Hello, World!\"", "Hello, World!", outContent.toString().trim());
    }
}
