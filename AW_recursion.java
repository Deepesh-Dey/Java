import java.util.Scanner;
public class AW_recursion{
    static int factorial(int x){                // method (finding factorial using reccursion)
        if (x==0){                              // or, use (x==0 || x==1)
            return 1;
        }
        else{
            return(x*factorial(x-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want to find the factorial of:");
        int y = sc.nextInt();
        int fac = factorial(y);
        System.out.printf("Factorial = %d",fac);
    }  
}