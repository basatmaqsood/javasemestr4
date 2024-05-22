import java.util.Scanner;


public class task2 {
    // Rectangle class
    static class Rectangle {
        private double length;
        private double width;

        // Parameterized constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }



        // Method to get length
        public double getLength() {
            return length;
        }

        // Method to get width
        public double getWidth() {
            return width;
        }

        // Method to calculate perimeter
        public double perimeter() {
            return 2 * (length + width);
        }

        // Method to calculate area
        public double area() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter length and width
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        // Create object of Rectangle class
        Rectangle rectangle = new Rectangle(length, width);

        // Print length and width of rectangle
        System.out.println("Length of rectangle: " + rectangle.getLength());
        System.out.println("Width of rectangle: " + rectangle.getWidth());

        // Print perimeter and area of rectangle
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Area of rectangle: " + rectangle.area());

        scanner.close();
    }
}
