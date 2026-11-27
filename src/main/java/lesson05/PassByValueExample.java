package lesson05;

public class PassByValueExample {

    static void changeObject(Person person) {
        person = new Person("Bob", 20);
        System.out.println("Inside method: " + person.toString());
    }

    public static void main(String[] args) {
        Person original = new Person("Alice", 30);

        System.out.println("Before method: " + original.toString());

        changeObject(original);

        System.out.println("After method: " + original.toString());
    }
}