import java.util.Scanner;
public class task2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the number "+ (i+1));
            arr[i]=sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<10;i++){
            if(arr[i]==n){
                count = count + 1;
            }
        }
        System.out.println("The number "+n+" is present "+count+" times in the array.");
        sc.close();
    }
}
