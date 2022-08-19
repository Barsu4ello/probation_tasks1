package core_tasks;

public class Test10 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.colour = "blue";
        Car car2 = new Car();
        car2.colour = "blue";

        changeColour(car1, car2);

        System.out.println("Цвет car1: " + car1.colour);
        System.out.println("Цвет car2: " + car2.colour);
    }

    public static void changeColour(Car car1, Car car2){
        car1.colour = "red";
        car2 = new Car();
        car2.colour = "red";
    }
}

class Car{
    String colour;
}

