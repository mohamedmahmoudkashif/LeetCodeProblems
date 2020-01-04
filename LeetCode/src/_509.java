public class _509 {
    public int fib(int N) {
        if(N == 0){
            return 0;
        }
        else if(N == 1){
            return 1;
        }
        else{
            return fib(N-1) + fib(N-2);
        }
    }
}

class Solution2 {
    /**
     * Time: O(n)
     * Space: O(n)
     */
    public int fib(int N) {
        if (N < 2) {
            return N;
        }
        int[] fibNums = new int[N + 1];
        fibNums[0] = 0;
        fibNums[1] = 1;
        for (int i = 2; i <= N; i++) {
            fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
        }
        return fibNums[N];
    }
}
