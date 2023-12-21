import java.util.Scanner;

class RectangleAreaCalculator {
    // Method to calculate the area of a rectangle
    public static void calculateRectangleArea(double length, double breadth) {
        // Calculate the area
        double area = length * breadth;

        // Print the calculated area
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length and breadth of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Call the method to calculate rectangle area with user-provided values
        calculateRectangleArea(length, breadth);
    }
}