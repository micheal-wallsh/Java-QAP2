public class Person {

    String lastName;
    String firstName;
    Address home;

    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }

}
