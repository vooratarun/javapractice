package class1;

import java.util.HashMap;
import java.util.Map;

public class ReplaceCharacterWithOccurrence {

    // Function to replace each character with its occurrence count in the string
    public static String replaceCharacterWithOccurrence(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over the string to update the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Construct a new string with each character replaced by its frequency
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            result.append(frequencyMap.get(ch));
        }

        return result.toString();
    }

    // Main method to test the replaceCharacterWithOccurrence function
    public static void main(String[] args) {
        String original = "swiss";
        String result = replaceCharacterWithOccurrence(original);
        System.out.println("Original string: " + original);
        System.out.println("String with each character replaced by its occurrence: " + result);
    }
}
