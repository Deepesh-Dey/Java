import java.util.Scanner;
public class AN_factorial{
    public static void main(String[] args){
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = 1;
        while(true){
            if (n==0){
                System.out.printf("Factorial = %d\n",fac);
                break;
            }
            else{
                fac*=n;
                n--;
            }
        }
    }
}