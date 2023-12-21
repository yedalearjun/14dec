interface Shape {
    void input(); // Method to take input
    double area(); // Method to calculate area
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    // Implementing the input method for Circle
    @Override
    public void input() {
        // Taking input for radius
        // For simplicity, you can use Scanner for user input
        radius = 5.0; // You can replace this with actual user input
    }

    // Implementing the area method for Circle
    @Override
    public double area() {
        // Calculating area of the circle
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Implementing the input method for Rectangle
    @Override
    public void input() {
        // Taking input for length and width
        // For simplicity, you can use Scanner for user input
        length = 4.0; // You can replace this with actual user input
        width = 3.0;  // You can replace this with actual user input
    }

    // Implementing the area method for Rectangle
    @Override
    public double area() {
        // Calculating area of the rectangle
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Calling input() and area() methods for Circle
        circle.input();
        System.out.println("Area of Circle: " + circle.area());

        // Calling input() and area() methods for Rectangle
        rectangle.input();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
