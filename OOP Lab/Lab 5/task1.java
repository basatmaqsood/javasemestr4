import java.util.Scanner;

class task1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter the value of arr["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum = sum + arr[i][j];
            }
            arr[i][4]=sum;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}