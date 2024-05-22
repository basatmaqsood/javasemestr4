import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting city: ");
        String startingCity = scanner.nextLine();

        System.out.print("Enter the ending city: ");
        String endingCity = scanner.nextLine();

        System.out.print("Enter the distance between cities in miles: ");
        int distanceInMiles = scanner.nextInt();

        System.out.print("Enter the cost of travel per mile: ");
        float costPerMile = scanner.nextFloat();


        int totalCost = (int) (distanceInMiles * costPerMile);


        System.out.println("Total Cost of travelling from "+ startingCity +" to " + endingCity +" is " + totalCost);

        scanner.close();
    }
}
