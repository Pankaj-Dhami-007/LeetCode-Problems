public class RverseAnInteger {
    static int reverseInteger(int n){
        int rev = 0;
        int sign = 1;
        if(n<0){
          n= n*(-1);
          sign = -1;
        }
        while (n > 0) {
            int rem = n % 10;
            n/=10;
            rev = rev* 10 + rem;
        }
        return sign*rev;
    }
    public static void main(String[] args) {
        int num = -123;
        System.out.println(reverseInteger(num));
    }
}
