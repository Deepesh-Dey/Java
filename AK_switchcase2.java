import java.util.Scanner;
public class AK_switchcase2{
    public static void main (String[] args){
// also supports string type in the switch value ..........
        System.out.println("1:Deepesh\n2:bhaiya ji\n3:papa ji\n4:mummy ji");
        while (true){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter name :(in String)");
            String val = sc.nextLine();
            switch (val){
                case "Deepesh":
                    System.out.println("Hello Deepesh");
                    break;
                case "bhaiya ji":
                    System.out.println("Hello bhaiya ji");
                    break;
                case "papa ji":
                    System.out.println("Hello papa ji");
                    break;
                case "mummy ji":
                    System.out.println("Hello mummy ji");
                    break;
                default:
                    System.out.println("wrong name");
                    //break;
            }
        }
    }
}