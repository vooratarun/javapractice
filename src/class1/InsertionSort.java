package class1;

public class InsertionSort {

    public static   void printArray(int[] array) {
//        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void shiftElements(){}


    public  static void insertionSort(int[] array){


        for(int i =1; i < array.length;i++){
            int j = i-1;
            int x = array[i];
            while (j >= 0 &&  array[j] > x) {
                array[j+1] = array[j];
                j-=1;
            }
            array[j+1]= x;
        }

    }


    /**
     *
     *  8    ,5 ,7, 3 ,2
     *
     *  5,8,  7,3,2
     *
     * 5, 7, 8,   3,2
     *
     * 3,5,7,8, _
     *
     *
     */




    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};


//        insertionSort(array);
//        printArray(array);


    }
}

//    Start with the second element (consider the first element as sorted).
//        Compare this element with the elements before it.
//        Shift all the elements greater than the new element to one position to the right.
//        Insert the new element into the correct position.
//        Repeat the process for all the remaining elements.

//Step 1: The first element 5 is already sorted.
//Step 2: Take the second element 2. Compare it with 5 and insert it before 5. Array becomes [2, 5, 4, 6, 1, 3].
//Step 3: Take the third element 4. Compare it with 5 and insert it before 5. Array becomes [2, 4, 5, 6, 1, 3].
//Step 4: Take the fourth element 6. It is already in the correct position. Array remains [2, 4, 5, 6, 1, 3].
//Step 5: Take the fifth element 1. Compare it with 6, 5, 4, 2 and insert it at the beginning. Array becomes [1, 2, 4, 5, 6, 3].
//Step 6: Take the sixth element 3. Compare it with 6, 5, 4, 2 and insert it after 2. Array becomes [1, 2, 3, 4, 5, 6].



//    Break the input into two parts
//1st part is sorted and the second part is unsorted
//        Pick the element from the unsorted part and insert it in the sorted part
//        Repeat this process until we are left with no elements in the unsorted part.

