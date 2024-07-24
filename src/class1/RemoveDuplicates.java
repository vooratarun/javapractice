package class1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {


    public static String removeDups(String str){
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {

        String  output = removeDups("qqbbf");
        System.out.println(output);



    }
}
