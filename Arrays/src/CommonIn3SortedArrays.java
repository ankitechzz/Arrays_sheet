public class CommonIn3SortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
            commonElements(A,B,C,6,5,8);

    }
    static int commonElements(int A[], int B[], int C[], int n1, int n2, int n3){
        n1=A.length;
        n2=B.length;
        n3=C.length;

        int i=0;
        int j=0;
        int k=0;


        while(i<n1 && j<n2 && k<n3){
            if (A[i]==B[j] && B[j]==C[k]) {
                System.out.println(A[i] + " ");
                i++;
                j++;
                k++;
            }
            else if (A[i]<B[j]){
                i++;
            }
            else if (B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
        }
   return C[k];
    }
}


