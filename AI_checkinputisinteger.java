import java.util.Scanner;

public class AI_checkinputisinteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        boolean b = sc.hasNextInt();
        if (b==true){
            System.out.println("Integer");
        }
        else {
            System.out.println("Not an Integer");
        }
    }
} 