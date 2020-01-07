import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Bus bus2;
    private Person person;


    @Before
    public void before() {
        bus = new Bus("Clermiston", 54);
        bus2 = new Bus("Clermiston", 2);
        person = new Person();
    }

    @Test
    public void hasPassengers() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassengerIfTotalCountIsLessThanCapacity() {
        bus.add(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void canNotAddPassengerIfTotalCountIsMoreThanCapacity() {
        bus2.add(person);
        bus2.add(person);
        bus2.add(person);
        assertEquals(2, bus.getPassengers());
    }
}
