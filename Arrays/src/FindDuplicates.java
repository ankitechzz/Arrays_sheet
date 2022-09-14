public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3};
        duplicate(arr,5);
    }
    static int duplicate(int[] arr, int n){
        n = arr.length;
        int duplicates =0;
        int current = 0;
        current = arr[0];
        for (int i = 0; i < n-1; i++) {
            duplicates = arr[i];
            if (current == duplicates){
                return duplicates;
            }
            else {
                current = arr[0+i];
            }

        }
        System.out.println(duplicates);
        return duplicates;
    }
}
