import java.util.Scanner;

public class task2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY");
        int n = input.nextInt();
        if(n < 0 || n > 100){
            System.out.println("INVALID LENGTH");
            System.exit(0);
        }
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("ENTER ELEMENT " + (i+1));
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        float avg = sum / n;
        float StandardDeviation = 0;
        for(int i = 0; i < n; i++){
            StandardDeviation = StandardDeviation + (float)Math.pow((arr[i] - avg), 2);
        }
        StandardDeviation = (float)Math.sqrt(StandardDeviation / n);
        System.out.println("STANDARD DEVIATION: " + StandardDeviation);
        input.close();

        


    }
}
