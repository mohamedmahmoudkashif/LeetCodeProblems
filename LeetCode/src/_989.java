import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class _989 {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        String num = "";
        for(int i=0;i<A.length;i++){

            num+=A[i];
        }
        BigInteger a = new BigInteger(String.valueOf(num));
        List<Integer> list = new ArrayList<Integer>();


        BigInteger x = a.add(BigInteger.valueOf(K));


        String numStr = x.toString();
        for(int i=0;i<numStr.length();i++){
            int c = Character.getNumericValue(numStr.charAt(i));
            list.add(c);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        return list;
    }
}
