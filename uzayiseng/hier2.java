class Main {
    public static void main(String[] args) {
interface Shape {
    double calculateArea();
    void display();
}

// Child class 1
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle with radius " + radius);
    }
}

// Child class 2
class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void display() {
        System.out.println("Square with side " + side);
    }
}
 
        // Creating objects
        Circle myCircle = new Circle(5.0);
        Square mySquare = new Square(4.0);

        // Accessing methods
        myCircle.display();
        System.out.println("Area: " + myCircle.calculateArea());

        mySquare.display();
        System.out.println("Area: " + mySquare.calculateArea());
    }
}