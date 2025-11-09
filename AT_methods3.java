public class AT_methods3{
    static void change1(int x){                // no change when integer is used     
        x = 20;
    }
    static void change2(int[] arr){             // changed when array is used     
        arr[0] = 20;
    }

    public static void main(String[] args){
        
        int a = 10;
        change1(a);
        System.out.printf("value of the integer = %d\n",a);
        
        int [] array1 = {10,20,30,40};
        change2(array1);
        System.out.printf("value of the first element = %d",array1[0]);
        
    }  
}