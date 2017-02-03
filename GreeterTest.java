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
    public void greetDefault(){
        Greeter.main();
        assertEquals("failure, should be equal to \"Hello, Clint\"", "Hello, Clint", outContent.toString().trim());
    }
    @Test
    public void greetJay(){
        Greeter.main("Jay");
        assertEquals("failure, should be equal to \"Hello, Jay\"", "Hello, Jay", outContent.toString().trim());
    }
    @Test 
    public void parse3Args(){
        Greeter greeter = new Greeter();
        greeter.parseArgs("Tom", "Dick", "Harry");
        assertEquals("3 arg failure, should be equal to 'Harry'", "Harry", greeter.getName());
    }
    @Test
    public void parseArgs(){
        Greeter greeter = new Greeter();
        greeter.parseArgs("Harry");
        assertEquals("1 arg failure, should be equal to 'Harry'", "Harry", greeter.getName());
    }
    @Test
    public void caseCorrection(){
        Greeter greeter = new Greeter();
        greeter.parseArgs("george");
        assertEquals("case correction failure", "George", greeter.getName());
        
    }

}
