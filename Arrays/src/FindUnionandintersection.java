public class FindUnionandintersection {
    public static void main(String[] args) {
       int[] arr1 = {7, 1, 5, 2, 3, 6};
       int[] arr2 = {3, 8, 6, 20, 7};
       sort(arr1,arr2);

    }
    static void sort(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if (i == j){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
