public class AB_outputtypes{
    public static void main(String[] args){
        System.out.print("Hello "); // will print Hello then the cursor stays to the same line. 
        System.out.println("World"); // will print World then the cursor moves to the next line.

        int a=10;
        float b=20.5f;
        System.out.printf("The value of a is %d and the value of b is %f",a,b); //Format specifiers %d->integers and %f->float
        // will print The value of a is 10 and the value of b is 20.5

        System.out.println(); // one line gap
        System.out.printf("The value of b is (only two numbers after decimal) %.2f",b); // use of <.n> b/w %f

        System.out.println(); // one line gap
        System.out.printf("The value of b is (taking a total of eight spaces) %8.3f",b); // use of <m.n> b/w %f
        // m -> total space(include the numbers and point(.)) and n -> total numbers after decimal

        // %c->character and %s->string (same as C programming)

        System.out.println(); // one line gap
        System.out.format("The value of a is %d and the value of b is %f",a,b); // same as that of printf.




    }
}