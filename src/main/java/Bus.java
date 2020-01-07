import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPerson(Person person) {
        if(this.capacity > getPassengers() ){
            this.passengers.add(person);
        }
    }

    public Person removePerson() {
       return this.passengers.remove(0);
    }
}
