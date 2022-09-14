import java.util.Arrays;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,5,1,3,6,4};
        maxprofit(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int maxprofit(int[]arr){
        int min = arr[0];
        int maximumprofit = 0;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
            profit = arr[i] - min;
            maximumprofit = Math.max(maximumprofit,profit);
        }
        System.out.println(maximumprofit);
         return maximumprofit;
    }
}
