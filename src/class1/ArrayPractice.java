package class1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static   void printArray(int[] array) {
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public int findMinEle(int[] array) {
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

    static int findElementIndex(int[] arr, int n, int key)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }

    static int[] insertElementInArray(int[] array, int position, int ele) {

        int[] newArray = new int[array.length + 1];
        for(int i=0; i < array.length;i++) {
            if(i == position){
                newArray[i] = ele;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;

    }


    static int[] deleteElementAtPosition(int[] array, int position ) {

        int[] newArray = new int[array.length-1];
        int j= 0;
        for(int i=0; i < array.length;i++) {
            if(i != position) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;

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

//        ArrayPractice arrayPractice = new ArrayPractice();
//        arrayPractice.printArray(new int[]{10,3,4,5});
//
//        int minEle = arrayPractice.findMin(new int[]{-10,3,-4,5});
//        System.out.println(minEle);
//
//        arrayPractice.reverseArray(new int[]{1,2,3,4});
//        arrayPractice.reverseArraySwap(new int[]{1,2,3,4,5});
//
//        int[] arr = {1,2,3,4,5};
//        arrayPractice.swapIndices(arr,1,4);
//        arrayPractice.printArray(arr);

        int[] array = {1,2,3,4,5};
        int[] newArray = insertElementInArray(array,0,30);
        printArray(newArray);

        int[] array2 = {1,2,3,4,5};

        int[] newArray2 = deleteElementAtPosition(array2, 2);
        printArray(newArray2);

    }
}
