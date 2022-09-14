import java.util.Arrays;

public class Moveallnegativenumberstobeginning {
    public static void main(String[] args){
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
   public static void sort(int[] arr){
        Arrays.sort(arr);
    }
}

