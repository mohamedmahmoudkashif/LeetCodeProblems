import java.util.*;

class Solution {
    public int firstUniqChar(String s1) {
        LinkedHashMap<Character, Integer> linkedMap = new LinkedHashMap<>();

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(linkedMap.containsKey(s1.charAt(i))){
                linkedMap.put(s1.charAt(i), linkedMap.get(s1.charAt(i)) + 1);
            }else {
                linkedMap.put(s1.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: linkedMap.entrySet()){
            if(entry.getValue() == 1){
                return s1.indexOf(entry.getKey().toString().toCharArray()[0]);
            }
        }
        return -1;



    }
}