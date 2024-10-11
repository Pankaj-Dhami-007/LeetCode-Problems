
/**
 * Problem231 ----[ Power of Two ]
 */
import java.util.Scanner;
public class Problem231 {
    static boolean checkPowerOfTwo(int n){
       double i =1;
       while(i < n){
           i = i * 2;
       }
       return i == n;
    }

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int num = sc.nextInt();
        System.out.println(checkPowerOfTwo(num));
        sc.close();
    }
}