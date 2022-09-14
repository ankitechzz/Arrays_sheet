public class SubArraySum0 {
    public static void main(String[] args) {
     int[] arr = {4 ,2 ,-3 ,1 ,6};
     findsum(arr, arr.length);
    }

    static boolean findsum(int arr[], int n) {
        int currentsum =0;
    int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currentsum = currentsum +arr[i];
            if (currentsum == 0){
                maxsum =currentsum;
                return true;
            }
        }
     return false;
    }
}
