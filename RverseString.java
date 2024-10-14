

public class RverseString {
    static void reverseAString(char[] s){
        int i =0;
        int j = s.length-1;
        while (i<= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.print("[ ");
        for (char c : s) {
            System.out.print(c+" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        char[] arr = {'D', 'H', 'A', 'M', 'I'};
        
        
        reverseAString(arr);
    }
}
