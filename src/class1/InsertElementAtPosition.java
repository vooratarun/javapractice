package class1;

public class InsertElementAtPosition {

    // Function to insert an element at a given position in an array
    public static void insertAtPosition(int[] array, int n, int element, int position) {
        if (position < 0 || position > n) {
            System.out.println("Invalid position");
            return;
        }

        // Shift elements to the right to make room for the new element
        for (int i = n - 1; i >= position; i--) {
            array[i + 1] = array[i];
        }

        // Insert the new element at the given position
        array[position] = element;
    }


    // Function to print the array
    public static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[6]; // Array with extra space
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        array[3] = 5;
        array[4] = 6;
        int n = 5; // Current number of elements in the array
        int elementToInsert = 3;
        int position = 2; // Position to insert the new element

        System.out.println("Original Array:");
        printArray(array, n);

        insertAtPosition(array, n, elementToInsert, position);

        System.out.println("Array after insertion:");
        printArray(array, n + 1);
    }
}
