import java.util.Scanner;
public class AO_arrayintro{
    public static void main(String[] args){
        System.out.println("Enter length of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n ; i++){
            System.out.printf("Enter element on index %d: \n",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("The final array 1 is: ");
        for (int j = 0 ; j<n ; j++){
            System.out.printf("%d ",arr[j]);
        }
        //arr[n+1] = 15;    //IndexOutOfBoundsException

        // also we can declare an array without setting it's length as:
        int [] arr1 = {12,35,67,32,456,12};
        int x = arr1.length;          //(dot).length
        System.out.printf("\n\n%d \n",x);
        System.out.println("The final array 2 is: ");
        for (int k = 0 ; k<x ; k++){
            System.out.printf("%d ",arr1[k]);
        }
        System.out.println("\n\ndisplay using for each loop:");
        System.out.println("The final array 2 is: ");
        for (int element: arr1){
            System.out.println(element);
        }

        System.out.println("Enter no of columns of the array: ");
        int a = sc.nextInt();
        System.out.println("Enter no of rows of the array: ");
        int b = sc.nextInt();
        System.out.println("2-D array:");
        int[][] arr2 = new int[a][b];
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<b ; j++){
            System.out.printf("Enter element on index [%d][%d] : \n",i,j);
            arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<b ; j++){
            System.out.printf("element on index [%d][%d] = %d \n",i,j,arr2[i][j]);
            }
        }
        for (int i = 0 ; i<a ; i++){
            for (int j = 0 ; j<b ; j++){
            System.out.print(arr2[i][j]);
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}