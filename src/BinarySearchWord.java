import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	public static int binarySearch(String[] words, String target) {
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            int mid = (right+left) / 2;

            int comparison = target.compareTo(words[mid]);

            // Check if the target is at mid
            if (comparison == 0) {
                return mid; // Target found
            }

            // If target is greater, ignore the left half
            if (comparison > 0) {
                left = mid + 1;
            } else { // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
    public static void main(String[] args) throws IOException {
        // Read the words from the file
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        String line = br.readLine();
        String[] words = line.split(",");
        br.close();
        
        // Sort the words
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        // Get the word to search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to search:");
        String word = scanner.nextLine();

        // Perform binary search
        int result = binarySearch(words, word);
        System.out.println(result);
        if (result >= 0) {
            System.out.println("Word found at position " + result);
        } else {
            System.out.println("Word not found.");
        }
    }
}

