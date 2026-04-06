import java.util.Scanner;
// one's complement of a number
class Logic {

    public int[] bin(int num) {
        int[] arr = new int[8];
        int i = 0;

        while (num > 0 && i < 8) {
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }
        return arr;
    }

    public String com(int n) {
        int[] arr1 = bin(n);
        String str = "";

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] == 0) {
                str += "1";
            } else {
                str += "0";
            }
        }
        return str;
    }
}

public class AAA_EXTRA_1 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Integer: ");
        int n = sc.nextInt();

        System.out.println("The 1's Complement: " + obj.com(n));
    }
}
