import java.util.Scanner;

public class task2 {
    static class Rectangle {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }

        public double area() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Length of rectangle: " + rectangle.getLength());
        System.out.println("Width of rectangle: " + rectangle.getWidth());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Area of rectangle: " + rectangle.area());
        scanner.close();
    }
}
