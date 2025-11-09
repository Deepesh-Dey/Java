import java.util.Scanner;
public class AP_swaparray{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of the array: ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0 ; i<n ; i++){
                System.out.printf("Enter element in the %d index: ",i);
                arr[i]=sc.nextInt();
            } 
            System.out.println("Array:");
            for (int j = 0 ; j<n ; j++){
                System.out.printf("%d ",arr[j]);
            } 
            int t;
            for (int k = 0 ; k<(int)((n/2)) ; k++){
                t=arr[k];
                arr[k]=arr[n-k-1];
                arr[n-k-1]=t;
            }
            System.out.println("\nArray after reversing:");
            for (int j = 0 ; j<n ; j++){
                System.out.printf("%d ",arr[j]);
            } 
            System.out.println("\nPrinting using for-each loop");
            for(int element: arr){
            System.out.println(element);
        }
    }
}