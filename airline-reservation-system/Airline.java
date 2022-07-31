public class Airline {

    // fields
    private Person[] seats;

    // 1. Constructor
    public Airline(){
        this.seats = new Person[11];
    }
    // 2. Getter
    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }

    // 3. setter

    public void setPerson(Person person){
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }

    public void createReservation(Person person){
        int index = person.getSeatNumber() - 1;
        seats[index] = new Person(person);
        System.out.println("Thank you "+person.getName() + " for flying with Java airlines. Your seat number is "+ person.getSeatNumber()+".\n");
    }
}
