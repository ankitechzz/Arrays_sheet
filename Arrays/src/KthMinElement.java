public class KthMinElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(algo(arr, 3));
    }
    static int algo(int[] arr, int k){
       return arr[arr.length-k];
    }


}
