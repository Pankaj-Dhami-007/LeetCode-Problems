public class Problem704 {
    static int binarySearch(int arr[], int t){
        int low =0;
        int high = arr.length-1;
        while(low < high){
            int mid = low +(high - low)/2;
        
            if(arr[mid] < t){
                low = mid +1;
            } else{
                high = mid;
            }
        }
        return arr[low] == t ? low : -1;
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch(nums, -3));
    }
}
