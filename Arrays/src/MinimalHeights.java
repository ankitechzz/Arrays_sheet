import java.util.Arrays;

public class MinimalHeights {
    public static void main(String[] args) {
        int[] arr = {2 ,6, 3 ,4 ,7 ,2 ,10, 3 ,2, 1};
        Arrays.sort(arr);
        System.out.println("sorted array is ");
        System.out.println(Arrays.toString(arr));
        getMinDiff(arr,10,5);
    }
    static int getMinDiff(int[] arr, int n, int k) {
        n = arr.length;
        int diff = arr[n-1] - arr[0];
         int  min,max;
        for (int i =1 ; i < n; i++) {
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i]-k);
            if (min<0){
                continue;
            }
            int ans = max-min;
            diff = Math.min(diff,ans);
        }
        System.out.println(diff);
        return diff;
    }
}
