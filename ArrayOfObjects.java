class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Model: " + model);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("BMW");
        cars[1] = new Car("Audi");
        cars[2] = new Car("Mercedes");

        for (Car c : cars) {
            c.display();
        }
    }
}
