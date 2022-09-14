import java.util.Arrays;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        getPairsCount(arr,arr.length,2);
    }
    static int getPairsCount(int[] arr, int n, int k) {
        int output = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==k){
                    output++;
                }
            }
        }
        System.out.println(output);
        return output;
    }
}
