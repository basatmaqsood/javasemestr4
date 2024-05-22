import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void quadrant() {
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        } else if (x == 0 && y != 0) {
            System.out.println("On Y Axis");
        } else if (x != 0 && y == 0) {
            System.out.println("On X Axis");
        }
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x-coordinate of the point:");
        int xCoord = scanner.nextInt();

        System.out.println("Enter the y-coordinate of the point:");
        int yCoord = scanner.nextInt();

        Point point1 = new Point(xCoord, yCoord);
        System.out.print("Original Point 1: ");
        System.out.print(point1);
        System.out.print(" is in ");
        point1.quadrant();
        System.out.println();

        point1.translate(2, 4);
        System.out.print("Translated Point 1: ");
        System.out.print(point1);
        System.out.print(" is in ");
        point1.quadrant();

        scanner.close();
    }
}

