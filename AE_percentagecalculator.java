import java.util.Scanner;

public class AE_percentagecalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects: ");
        int n = sc.nextInt();
        float sum = 0.0f;
        for (int i=0; i<n; i++){
            System.out.print("enter marks of subject ");
            System.out.print(i+1);
            System.out.print(" : ");
            float m = sc.nextFloat();
            sum += m;
        }
        System.out.print("The percentage = ");
        System.out.print(sum/n);
        System.out.println(" %");
        System.out.print("SGPA: (when no one gets a full marks): ");
        System.out.print(((int)(sum/n/10))+1);
    }
}