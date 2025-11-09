public class AV_varargs{
    static void sum1(int ...arr){                              // available as int[] arr. so no of parameters are not fixed          
        int result = 0 ;                                       // that means can pass 0,1,2,3,... no's of parameters 
        for (int x : arr){             // readed as for(int a(element) in arr(array))
            result += x;
        }
        System.out.printf("sum of all the numbers that are passed = %d\n",result);
    }
    static void sum2(int a ,int ...arr){                        // here a is the compulsary parameter         
        int result = a;                                         // that means in the function, we must pass 'a', and more (if wanted)
        for (int x : arr){
            result += x;
        }
        System.out.printf("\nsum of all the numbers that are passed = %d",result);
    }
    public static void main(String[] args){
        
        sum1();
        sum1(1,2);
        sum1(1,2,3);
        sum1(1,2,3,4,5);

        //sum2();                                               //throws an error
        sum2(1);
        sum2(1,2,3);
        sum2(1,2,3,4,5);

    }  
}