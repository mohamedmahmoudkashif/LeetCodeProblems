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
