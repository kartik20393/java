class Person {
    String name;

    // Default constructor
    Person() {
        this.name = "Unknown";
    }

    // Parameterized constructor
    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Person p1 = new Person(); // default constructor
        Person p2 = new Person("John"); // parameterized constructor
        p1.display();
        p2.display();
    }
}
