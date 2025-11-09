import java.util.Scanner;
public class AS_methods2{
    int factorial(int x){                // method without static : we need to make an object 
        if (x==1){
            return 1;
        }
        else{
            return(x*factorial(x-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        AS_methods2 me = new AS_methods2();             // object created

        System.out.println("Enter the number you want to find the factorial of:");
        int y = sc.nextInt();
        int fac = me.factorial(y);                 // object.methos()
        System.out.printf("Factorial = %d",fac);
    }  
}