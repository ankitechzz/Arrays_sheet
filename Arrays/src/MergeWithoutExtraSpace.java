import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        long[] arr1 = {1, 3, 5 ,7};
        long[] arr2 = {0 ,2 ,6 ,8 ,9};
        merge(arr1,arr2,4,5);
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
       n = arr1.length;
       m = arr2.length;
       int[] arr3 = new int[m+n];
        System.out.println(Arrays.toString(arr3));
    }
}
