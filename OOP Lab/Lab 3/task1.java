import java.util.Scanner;

class task1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.println("Enter number of rows in first matrix: ");
        r1 = input.nextInt();
        System.out.println("Enter number of columns in first matrix: ");
        c1 = input.nextInt();
        System.out.println("Enter number of rows in second matrix: ");
        r2 = input.nextInt();
        System.out.println("Enter number of columns in second matrix: ");
        c2 = input.nextInt();
        if(c1 != r2){
            System.out.println("Multiplication not possible");
            System.exit(0);
        }
        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        System.out.println("For Array 1");
        inputMatrix(arr1, r1, c1);
        System.out.println("For Array 2");
        inputMatrix(arr2, r2, c2);
        int[][] result = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                result[i][j] = 0;
                for(int k=0;k<c1;k++){
                    result[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Resultant matrix is: ");    
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }       
    }

    
    public static void inputMatrix(int[][] arr, int r, int c){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter element at position ("+i+","+j+")");
                arr[i][j] = input.nextInt();
            }
        }
    }
}