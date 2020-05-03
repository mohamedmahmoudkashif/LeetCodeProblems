public class _1047 {
    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        for(int i= 0;i<S.length();i++){
            for(int j=i+1;j<S.length();j++) {
                if(S.charAt(i) == S.charAt(j)){
//                    if((i+1) == j){
//                        sb = sb.deleteCharAt(i);
//                        S = String.valueOf(sb.deleteCharAt(i));
//                    }
                   return  removeDuplicates(S.substring(0, i) + S.substring(j + 2));
                }

            }
        }

        return sb.toString();
    }

}
