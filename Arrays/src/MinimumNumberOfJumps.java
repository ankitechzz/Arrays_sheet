import java.util.Random;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        minjump(arr);
    }
    static int minjump(int[] arr){
        int current=0;
        int destination = 0;
        int jump =0;
        for (int i = 0; i < arr.length-1; i++) {
            destination = Math.max(destination,arr[i]+i);
            if (current == i){
                current = destination;
                jump++;
            }
        }
        System.out.println(jump);
        return jump;
    }
}
