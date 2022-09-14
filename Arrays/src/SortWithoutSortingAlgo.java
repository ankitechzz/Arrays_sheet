public class SortWithoutSortingAlgo {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort012(arr,arr.length);
        System.out.println(arr.toString());
    }

    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void sort012(int arr[], int n) {
        // all necessary parameters for main code
        int l = 0;
        int m = 0;
        int h = n-1;

        while(m <= h){
            if (arr[m] == 0) {
                swap(arr[m],arr[l]);
                l++;
                m++;
            }
            else if (arr[m] == 1){
                m++;
            }
            else {
                swap(arr[m],arr[h]);
                h--;
            }
        }

    }
}