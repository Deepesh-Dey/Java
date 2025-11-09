import java.util.Scanner;
public class AH_condition{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<50){
            System.out.println("less than 50");
        }
        else if (a==50){
            System.out.println("equals 50");
        }
        else {
            System.out.println("greater than 50");
        }
    } 
}