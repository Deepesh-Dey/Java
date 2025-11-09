import java.util.Scanner;

public class AQ_checksortedarr{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean x=true;
        for (int i = 0 ; i<n ; i++){
            System.out.printf("Enter element in the %d index: ",i);
            arr[i]=sc.nextInt();
        } 
        System.out.println("Array:");
        for (int j = 0 ; j<n ; j++){
            System.out.printf("%d ",arr[j]);
        } 
        for (int k = 0 ; k<n-1 ; k++){
            if(arr[k]>arr[k+1]){
                x=false;
                break;
            }
        }
        if (x==true){
            System.out.println("\nSorted array");
        }
        else{
            System.out.println("\nnot sorted");
        }
        System.out.println("\nPrinting using for-each loop");
        for(int element: arr){
            System.out.println(element);
        }
        
    }
}