import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {5,4,3,7,6};
        int target = 9;
        int[] ans = new int[2];
        results(nums, ans, target);
        System.out.println(ans);
    }
    static int[] results(int[] nums, int[] ans, int target){
       ans = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
            break;
        }
        return ans;
    }
}
