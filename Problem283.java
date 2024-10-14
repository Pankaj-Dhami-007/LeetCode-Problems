public class Problem283 {
    // move zeros    hint- modifyArray
    static void moveZeros(int arr[]){
        int nonZeroIdx =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){   // [1, 3, 12, 3, 12]
                arr[nonZeroIdx] = arr[i];
                nonZeroIdx++;
            }
        }
        for (int i = nonZeroIdx; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        moveZeros(nums);
    }
}
