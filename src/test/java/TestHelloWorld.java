import net.thenightwolf.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by NightWolf on 5/21/2017.
 */
public class TestHelloWorld {

    @Test
    public void testHelloWorld() {
        assertEquals(new HelloWorld().helloWorld(), "Hello, World");
    }
}
