import java.util.Arrays;

public class RearrangearrayinalternatingpositivenegativeItems {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -4, -1, 4};
        System.out.println("Given Array is "+Arrays.toString(nums));

    }
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
       int[] result = new int[n];
        for (int i = 0; i < n ; i++) {
            if (nums[i] < 0){
                continue;
            }
            if (nums[0]>0){

            }
        }
        System.out.println("Result Array is "+Arrays.toString(result));
       return result;
    }
         static void swapNums(int[] nums, int index1,int index2){
            int temp = nums[index1];
            nums[index1]=nums[index2];
           nums[index2] = temp;
        }
    }

