import java.util.Arrays;

public class KadaneAlgorithm_MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        maxSubarraySum(arr,5);
        System.out.println(Arrays.toString(arr));
    }
   static int maxSubarraySum(int[] arr, int n){
        n = arr.length;
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            currentsum = currentsum+arr[i];
            if (currentsum > maxsum){
                maxsum = currentsum;
            }
             if (currentsum < 0){
                 currentsum = 0;
             }
        }
       System.out.println(maxsum);
        return maxsum;
    }
}
