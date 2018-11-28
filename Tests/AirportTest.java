
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

}