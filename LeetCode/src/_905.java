public class _905 {
    public static int[] sortArrayByParity(int[] A) {
        if(A.length == 1){
            return A;
        }
        int left = 0, right = A.length - 1;

        while(left < right){
            while(A[left] % 2 == 0 && left<right){
                left++;
            }
            while(A[right] % 2 == 1 && left<right){
                right--;
            }
            if(left < right){
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        return A;
    }
}
