import java.util.Arrays;
import java.util.Collections;

public class _896 {
    public static boolean isMonotonic(int[] A) {
        int[] temp = Arrays.copyOf(A, A.length);
        Arrays.sort(A); // sorted

        int[] sortedDescending = new int[A.length];

        sortedDescending = Arrays
                .stream(temp)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        if (Arrays.equals(temp, A) || Arrays.equals(temp, sortedDescending)) {
            return true;
        }
        return false;

    }
}

// Another efficient solution

class Solution {
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    public boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] > A[i+1]) return false;
        return true;
    }

    public boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i)
            if (A[i] < A[i+1]) return false;
        return true;
    }
}
