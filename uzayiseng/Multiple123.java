 class Multiple123{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();      
        car.drive();      
        car.carEngine.ignite();
    }
}
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class FourWheeler extends Vehicle {
    void accelerate() {
        System.out.println("FourWheeler is accelerating");
    }
}

class Engine {
    void ignite() {
        System.out.println("Engine is igniting");
    }
}

class Car extends Vehicle {
    Engine carEngine;

    Car() {
        this.carEngine = new Engine();
    }

    void drive() {
        System.out.println("Car is driving");
    }
}

