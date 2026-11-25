package lesson05;

public class Person {
    private final String name;
    private final int age;

    public Person(String name) {
        // Prologue: executes before this(...)
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }

        String normalized = name.trim();

        // Delegate to another constructor
        this(normalized, 30);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "name: " + name + ", age: " + age;
    }

    public static void main(String[] args)
    {
        Person person = new Person("John Smith");
        System.out.println(person);
    }
}