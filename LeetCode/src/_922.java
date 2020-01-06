public class _922 {
    public static int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)
            if (A[i] % 2 == 0) {
                while (A[j] % 2 == 0)
                    j += 2;

                // Swap A[i] and A[j]
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        for(int x=0;x<A.length;x++){
            System.out.println(A[x]);
        }
        return A;
    }
}
