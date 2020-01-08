import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _888 {
    public static boolean isPrime(int num) {
//        Arrays.sort(A);
//        Arrays.sort(B);
//
//        int a = A[A.length-1];
//        int b = B[B.length-1];
//
//        int [] ans = new int [2];
//        ans[0] = a;
//        ans[1] = b;
//        for(int i=0;i<ans.length;i++){
//            System.out.println(ans[i]);
//        }
//        return ans;
//        if(B <= 1){
//            return false;
//        }
//        List<Integer> list = new ArrayList<>();
//        for(int i=2;i<Math.sqrt(B);i++){
//            if(B%i == 0) {
//                list.add(i);
//                System.out.println(i);
//                return false;
//            }
//        }
////        if(list.size() > 1){
////            return false;
////        }
//
//        return true;
//        for (int i = 2; i < Math.sqrt(B); i++) {
////            if (B % i == 0) {
////                return false;
////            }
////        }
////        return true;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String [] args){
        int [] A = {1,2,5};
        int [] B = {2,4};
        System.out.println(isPrime(4));
    }
}
