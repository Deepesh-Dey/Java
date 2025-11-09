import java.util.Scanner;

public class AF_stringintro{
    public static void main(String[] args){
        String str = new String ("deepesh"); // string is a class in java thus here we can create a new object to it.
        System.out.println(str);

        String name = "Deepesh"; // name -> reference and "Deepesh" -> object
        System.out.println(name);

        System.out.println();

        // using sacnner class 
        Scanner sc = new Scanner (System.in);

        /*System.out.println("Write a sentance.");
        String str1 = sc.next();
        System.out.println(str1);                 // prints only one word before space 
        */
        /*System.out.println("Write a sentance.");
        String line = sc.nextLine();
        System.out.println(line);                 // prints full line 
        */

        // next ke baad next/nextLine use karne se continue hoga ...

        System.out.println("Write a sentance.");
        String str1 = sc.next();
        System.out.println(str1);
        String str2 = sc.next();
        System.out.println(str2);
        String line = sc.nextLine();
        System.out.println(line);  
        
    }
}