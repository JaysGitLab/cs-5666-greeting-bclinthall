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
        assertEquals("failure, should be equal to \"Hello, Clint\"", "Hello, Clint", outContent.toString().trim());
    }

    @Test 
    public void parse3Args(){
        Greeter greeter = new Greeter();
        Greeter.GreeterArgs greeterArgs = greeter.parseArgs("Tom", "Dick", "Harry");
        assertEquals("3 arg failure, should be equal to 'Harry'", "Harry", greeterArgs.getName());
    }
    @Test
    public void parseArgs(){
        Greeter greeter = new Greeter();
        Greeter.GreeterArgs greeterArgs = greeter.parseArgs("Harry");
        assertEquals("1 arg failure, should be equal to 'Harry'", "Harry", greeterArgs.getName());
    }
}
