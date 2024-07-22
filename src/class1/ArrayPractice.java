package class1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public   void printArray(int[] array) {
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printArray(array);


        Arrays.sort(array); // collection function to sort array
        arrayPractice.printArray(array);

    }
}
