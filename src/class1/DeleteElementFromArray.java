package class1;

public class DeleteElementFromArray {

    // Function to delete an element at a given position in an array
    public static void deleteAtPosition(int[] array, int n, int position) {
        // Check if the position is valid
        if (position < 0 || position >= n) {
            System.out.println("Invalid position");
            return;
        }

        // Shift elements to the left to overwrite the element at the given position
        for (int i = position; i < n - 1; i++) {
            array[i] = array[i + 1];
        }

        // Optionally, set the last element to a default value (e.g., 0)
        array[n - 1] = 0;
    }

    // Function to print the array
    public static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int n = array.length;
        int position = 2; // Position to delete the element

        System.out.println("Original Array:");
        printArray(array, n);

        deleteAtPosition(array, n, position);

        System.out.println("Array after deletion:");
        printArray(array, n - 1);
    }
}
