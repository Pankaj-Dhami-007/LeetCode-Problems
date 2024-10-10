/**
 * Problem852
 */
public class Problem852 {
    static int secondApproach(int arr[]){// linear search   TC -- o(n)
        int i = 0;
        while (arr[i] < arr[i+1]) {
            i++;
        }
        return i;
    }
    static int peakIndexInMountainArray(int arr[]){// binary search
        int low =0;
        int high = arr.length-1;
        while (low < high) {
            //int mid =( low + high )/ 2;    integer overflow
            int mid = low + ( high - low)/2;
            if (arr[mid] < arr[mid+1]) {
                low = mid+1;       
            } else{
                high = mid;
            }
            
        }
      return low;
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 10, 15, 10, 9, 6, 3, 1};
        //System.out.println(secondApproach(num));
        System.out.println(peakIndexInMountainArray(num));
    }
}