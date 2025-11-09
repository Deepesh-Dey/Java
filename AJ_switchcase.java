import java.util.Scanner;
public class AJ_switchcase{
    public static void main (String[] args){

        System.out.println("1:Hello;\n2:Good Morning\n3:Bye");
        while (true){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter any Choice :");
            int val = sc.nextInt();
            switch (val){
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Good Morning");
                    break;
                case 3:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Wrong Value");
                    break;
            }
        }
    }
}