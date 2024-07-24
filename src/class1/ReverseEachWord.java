package class1;

import java.util.Arrays;

public class ReverseEachWord {

    // Function to reverse each word in a string
    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            // Reverse the current word
            String reversedWord = reverseWord(word);
            // Append the reversed word to the result
            reversedString.append(reversedWord).append(" ");
        }

        // Convert StringBuilder to string and trim the trailing space
        return reversedString.toString().trim();
    }

    // Helper function to reverse a single word
    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }

    public static String revWords(String  str) {
        String[] words = str.split(" ");

        StringBuilder revString = new StringBuilder();
        for(String word: words) {
            String revWord = revWord(word);
            revString.append(revWord).append(" ");
        }
        return  revString.toString().trim();
    }



    public static String revWord(String  word) {
        StringBuilder revWord = new StringBuilder(word);
        return revWord.reverse().toString();
    }


    public static  String  reverseString(String word) {
        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length -1;
        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right]= temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    // Main method to test the reverseWords function
    public static void main(String[] args) {
//        String original = "Hello World from Java";
//        String result = reverseWords(original);
//        System.out.println("Original string: " + original);
//        System.out.println("String with each word reversed: " + result);

        System.out.println( reverseString("ABCD"));
    }
}
