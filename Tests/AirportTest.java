
import org.junit.Test;

import static org.junit.Assert.*;


public class AirportTest {

    @Test
    public void returnCapacity() throws Exception {

        Airport test1 = new Airport();
        test1.initialize();
        String result = test1.returnCapacity();
        assertEquals("The airfield capacity is 100", result);

    }

    @Test
    public void instructLand() throws Exception {
        Airport test2 = new Airport();
        test2.initialize();
        String result = test2.instructLand();
        assertEquals("The plane can land!", result);

    }

}