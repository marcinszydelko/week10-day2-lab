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
        bus.addPerson(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void canNotAddPassengerIfTotalCountIsMoreThanCapacity() {
        bus2.addPerson(person);
        bus2.addPerson(person);
        bus2.addPerson(person);
        assertEquals(2, bus2.getPassengers());
    }

    @Test
    public void canRemovePassengerFromBus() {
        bus.addPerson(person);
        bus.removePerson();
        assertEquals(0, bus.getPassengers());
    }


}
