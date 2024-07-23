package class1;

public class ArrayPracticeNew {


    public static  void printArray(int[] array) {
        for(int i =0; i < array.length;i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }

    public static void findKeyInArray(int[] array, int key) {
        int i = 0;
        while (i < array.length) {
            if(array[i] == key) {
                System.out.println("Element found");
                break;
            }
            i++;
        }
        System.out.println("Element not found in given array");
    }

    public static int findMinNumber(int[] array) {
        if(array.length == 1) return  array[0];

        int minEle = array[0];

        for(int i =1; i < array.length;i++) {
            if(array[i] < minEle) {
                minEle = array[i];
            }
        }
        return minEle;
    }
    public static  int findMinIndex(int[] array) {

        int minIndex = 0;
        for(int i =1; i < array.length;i++){
            if(array[i] < array[minIndex]){
                minIndex = i;
            }
        }
        return  minIndex;
    }

    public static int findMinIndexSubArray(int[] array, int start, int end) {
        int minIndex = start;
        for(int i = start +1; i <end;i++){
            if(array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return  minIndex;
    }

    public static void reverseArray(int[] array) {

        int[] newArray = new int[array.length];

        int j = 0;
        for(int i = array.length-1; i >=0; i--){
            newArray[j] = array[i];
            j++;
        }

        printArray(newArray);
    }

    public static void swapIndices(int[] array, int index1, int index2){

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void reverseSwap(int[] array) {

        System.out.println("given array");
        printArray(array);
        System.out.println("\n\n");


        int left =0;
        int right = array.length -1;

        // this loop will exit when left=right or left > right
        // left < right
        while (true) {

            if(left >= right) break;
//            int temp = array[left];
//            array[left] = array[right];
//            array[right] = temp;
            System.out.println("before swap"+ " " +left+ " "+right);
            swapIndices(array,left,right);
            printArray(array);
            left++;
            right--;
            System.out.println("after swap"+ " " +left+ " "+right);

        }


//        printArray(array);
    }

    public  static void insertEleArray(int[] array, int ele, int position) {

        int[] newArray = new int[array.length +1];

        for(int i =0; i< array.length;i++) {
            if(i == position){
                newArray[i] = ele;
            } else {
                newArray[i] = array[i];
            }
        }
        printArray(newArray);
    }

    public static void insertSorted(int[]array, int ele) {

        int[] newArray = new int[array.length +1];
        int i = 0;

        for(i = 0; i < array.length;i++){
            if(array[i] > ele)
                break;;
            newArray[i] = array[i];
        }

        newArray[i] = ele;
        for(int j = i+1; j < array.length; j++) {
            newArray[j] = array[j];
        }
        printArray(newArray);
    }

    public static void deleteElementAtPosition(int[] array, int position) {

        int[] newArray = new int[array.length -1];
        int j = 0;
        for(int i=0;i<array.length;i++) {
            if(i!=position) {
                newArray[j] = array[i];
                j++;
            }
        }
        printArray(newArray);
    }


    public static void selectionSort(int[] array) {
        for(int i= 0; i < array.length;i++){
            int minIndex = findMinIndexSubArray(array,i, array.length);
            swapIndices(array,minIndex,i);
        }
        printArray(array);
    }

    public static void main(String[] args) {
           int[] array = {1,-5,23,-34,5};
//            printArray(array);
//            findKeyInArray(array,5);
//            int minEle = findMinNumber(array);
//            int minIndex = findMinIndex(array);

//            System.out.println(minIndex);
//            reverseArray(array);
            //reverseSwap(array);
//            insertEleArray(array,300,2);

//            int[] sortedArray = {1,2,4,54,667};
//            insertSorted(sortedArray,-10);
                //deleteElementAtPosition(array,3);
            selectionSort(array);
    }
}
