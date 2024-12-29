import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String firstString, String secondString) {
        // Convert strings to character arrays
        char[] firstArray = firstString.toCharArray();
        char[] secondArray = secondString.toCharArray();

        // Sort both arrays
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // Compare sorted arrays
        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        // Check if the strings are anagrams
        if (isAnagram(word1, word2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
