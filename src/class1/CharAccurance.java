package class1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharAccurance {


    public static Character findFirstNonReCharacter(String stt) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char ch: stt.toCharArray()){
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() ==1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();

        String  s = "aabbccddd";

        for(char c : s.toCharArray()){
            if(map.containsKey(c)) {
                map.put(c, map.get(c) +1);
            } else {
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character: '" + entry.getKey() + "' - Occurrence: " + entry.getValue());
        }


    }
}
