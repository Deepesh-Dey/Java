import java.util.Scanner;
public class AX_fibonacchi{
    int fib(int x){                
        /*
        int a = 0;
        int b = 1;
        int i = 2;
        */
       
        /*
        if (x==1){
            return 0;
        }
        else if (x==2){
            return 1;
        }
        */
        if (x==1 || x==2){
        return x-1;
       }
        else{
            /*int c = 0;
            while (i<x){
                c = a+b ; 
                a=b;
                b=c;
                i++;
            }
            return c;
            */
           return fib(x-1)+fib(x-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        AX_fibonacchi f = new AX_fibonacchi();
        System.out.println("Enter the position of element in the fibonacchi series :");
        int y = sc.nextInt();
        int fval = f.fib(y);
        System.out.printf("the number is = %d",fval);
    }  
}