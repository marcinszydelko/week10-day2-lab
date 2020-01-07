import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Bus bus;
    private Person person;

    @Before
    public void before() {
        busstop = new BusStop("Calle Maria Martinez");
        bus = new Bus("Avenida de los Relleys", 5);
        person = new Person();
    }

    @Test
    public void hasQueue() {
        assertEquals(0, busstop.getQueue());
    }

    @Test
    public void canAddPersonToQueue() {
        busstop.addPersonToQueue(person);
        assertEquals(1, busstop.getQueue());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busstop.addPersonToQueue(person);
        busstop.removePersonFromQueue();
        assertEquals(0,busstop.getQueue());
    }


}
