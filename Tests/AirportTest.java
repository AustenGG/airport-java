
import org.junit.Test;

import static org.junit.Assert.*;


public class AirportTest {

    @Test
    public void returnCapacity() throws Exception {

        Airport test1 = new Airport();
        test1.initialize(50);
        String result = test1.returnCapacity();
        assertEquals("The airfield capacity is 50", result);

    }

    @Test
    public void landConfirmed() throws Exception {
        Airport test2 = new Airport();
        test2.initialize(10);
        String result = test2.landConfirmed(123);
        assertEquals("Aircraft on the ground: [123, 0, 0, 0, 0, 0, 0, 0, 0, 0]", result);

    }
    @Test
    public void instructLand() throws Exception{
        Airport test3 = new Airport();
        test3.initialize(100);
        String result = test3.instructLand();
        assertEquals("The plane may land when clear", result);

    }

    @Test
    public void takeOff() throws Exception{
        Airport test4 = new Airport();
        test4.initialize(10);
        test4.landConfirmed(123);
        test4.takeOff(123);
        String result = test4.takeOff(123);
        assertEquals("Aircraft on the ground: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", result);

    }
}