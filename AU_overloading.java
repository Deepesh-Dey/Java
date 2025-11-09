public class AU_overloading{
    static void func(){                    
        System.out.printf("\nhello world\n");
    }
    static void func(int a){                 
        System.out.printf("\nhello world %d times\n",a);
    }
    static void func(int a, int b){             
        System.out.printf("\nhello world %d times\n",a);
        System.out.printf("bye world %d times\n",b);
    }
    /*static int func(int a, int b){                            //throws error
        System.out.printf("\nhello world %d times\n",a);        //overloading is not possible with changing return type only 
        System.out.printf("bye world %d times\n",b);            //overloading is possible with changing no of parameters 
    }
    */
    public static void main(String[] args){
        
        func();
        func(100);
        func(200, 300);
        //func(400,500);

    }  
}