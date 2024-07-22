package class1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public   void printArray(int[] array) {
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public int findMin(int[] array) {
        int minEle = array[0];
        for(int i =1; i< array.length;i++){
            if(array[i] < minEle) {
                minEle = array[i];
            }
        }
        return minEle;
    }

    public  void reverseArray(int[] array) {
        int[] revArray = new int[array.length];
        int j = 0;
        for(int i = array.length -1; i>=0;i--) {
            revArray[j] = array[i];
            j++;
        }
        printArray(revArray);
    }


    public  void swapIndices(int[] array,int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
    public void reverseArraySwap(int[] array) {

        int left = 0;
        int right = array.length -1;
        // left < right
        while (true) {
            if(left > right)
                 break;
            swapIndices(array, left, right);
            left++;
            right--;
        }
        printArray(array);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        Arrays.sort(array); // collection function to sort array

        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printArray(new int[]{10,3,4,5});

        int minEle = arrayPractice.findMin(new int[]{-10,3,-4,5});
        System.out.println(minEle);

        arrayPractice.reverseArray(new int[]{1,2,3,4});
        arrayPractice.reverseArraySwap(new int[]{1,2,3,4,5});

        int[] arr = {1,2,3,4,5};
        arrayPractice.swapIndices(arr,1,4);
        arrayPractice.printArray(arr);

    }
}
