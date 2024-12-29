
import java.util.Scanner;

public class BubbleSort{

    // Method to perform bubble sort on an array
    public static void sortArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                // Swap adjacent elements if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.println("Enter the total number of elements:");
        int size = input.nextInt();

        // Initialize the array
        int[] elements = new int[size];
        System.out.println("Enter the elements:");

        // Populate the array
        for (int i = 0; i < size; i++) {
            elements[i] = input.nextInt();
        }

        // Sort the array
        sortArray(elements);

        // Display the sorted array
        System.out.println("Sorted elements:");
        for (int element : elements) {
            System.out.print(element + " ");
        }
    }
}
