package lesson06;

public class Child extends Parent {
    private int value1;  // No explicit initializer
    private int value2 = 10;
    Child(int input) {
        value1 = input * 2;  // Allowed!
        //value2 = 20;  // Not allowed!
        super();
        value2 = 30; //Allowed!
    }
}
