import java.util.Scanner;

class task1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting city is: ");
        String start = input.nextLine();
        System.out.println("Destination city is: ");
        String dest = input.nextLine();
        System.out.println("Distance between the cities is: ");
        int distance = input.nextInt();
        System.out.println("The cost of the trip is: ");
        int cost = input.nextInt();
        System.out.println("The total cost of travelling is " + (cost * distance) + " from " + start + " to " + dest);
    }
}