package class1;

public class InsertionSort {

    public static   void printArray(int[] array) {
//        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

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


        insertionSort(array);
        printArray(array);


    }
}
