import java.util.Scanner;
public class task2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int r = input.nextInt();
        System.out.println("Enter number of columns ");
        int c = input.nextInt();
        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        System.out.println("For Array 1");
        inputMatrix(arr1, r, c);
        System.out.println("For Array 2");
        inputMatrix(arr2, r, c);
        int[][] result = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println("Resultant matrix is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
    static public void inputMatrix(int[][] arr, int r, int c){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter element at position ("+i+","+j+")");
                arr[i][j] = input.nextInt();
            }
        }
    }
}
