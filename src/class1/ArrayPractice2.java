package class1;

public class ArrayPractice2 {

    public  static void printArray(int[] array){
        for(int i =0; i< array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public  static void printArrayTillN(int[] array, int n){
        for(int i =0; i< n;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void findEle(int[] array, int ele) {
        int i =0;
        while (i < array.length) {
            if(array[i] == ele){
                System.out.println("Element found");
                return;
            }
            i++;
        }
       System.out.println("Element not found");
    }

    public static void findMinEle(int[]array) {
        int minEle = array[0]; //assumeing first elment is minimum
        for(int i =1; i<array.length;i++){
            if(array[i] < minEle) {
                minEle = array[i];
            }
        }
        System.out.print("min ele is "+ minEle);
    }

    public static void findMinEleIndex(int[] array) {
        int minIndex = 0;
        for(int i= 1; i < array.length;i++){
            if(array[i] < array[minIndex]){
                minIndex = i;
            }
        }
        System.out.println("Min ele index " + minIndex);
    }

    public static void swapArray(int[] array, int index1, int index2){

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
//        printArray(array);
    }

    public static int findMinIndexInSubArray(int[] array, int start, int end){

        int minIndex = start;
        for(int i = start +1; i < end; i++){
            if(array[i] < array[minIndex]){
                minIndex = i;
            }
        }
//        System.out.println("minimum index "+ minIndex);
        return  minIndex;
    }

    public static void selectionSort(int[] array) {

        for(int i =0;i < array.length;i++){
            int minIndex = findMinIndexInSubArray(array,i,array.length);
            swapArray(array,i, minIndex);
            printArray(array);
            System.out.println();
        }
    }

    public static void reverseArray(int[] array){

        int[] newArray = new int[array.length];
        int j = 0;
        for(int i =array.length -1; i>=0; i--){
            newArray[j] = array[i];
            j++;
        }
        printArray(newArray);
    }

    public static void reverseArraySwaps(int[] array){

        int left = 0;
        int right = array.length -1;
        while (left < right){
            swapArray(array,left,right);
            left++;
            right--;
        }
        printArray(array);
    }

    public static void bubbleSort(int[] array){

        for(int i =0;i< array.length -1;i++){
            for(int j =0 ; j < array.length-1 -i;j++){
                if(array[j] < array[j+1]){
                    swapArray(array,j, j+1);
                }
            }
        }

        printArray(array);

    }



    public static int[]  deleteElePosition(int[] array, int position){

       int[] newArray = new int[array.length -1];
       int j = 0;
       for(int i =0; i < array.length;i++){
           if(i != position) {
               newArray[j]= array[i];
               j++;
           }
       }
        return newArray;
    }


    static int[] insertElement(int[] arr, int ele, int pos)  {

        int[] newarray =  new int[arr.length +1];
        for(int i =0; i < arr.length+1;i++){
           if(i < pos) {
               newarray[i] = arr[i];
           } else if(i == pos){
               newarray[i] = ele;
           } else {
               newarray[i] = arr[i-1];
           }
        }
        return newarray;

    }

    public static void insertionSort(int[] arr) {

        for(int i =0; i < arr.length-1; i++){
            int j =i-1;
            int x = arr[i];
            while (j >= 0 && arr[j] > x) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
        printArray(arr);
    }


    public static void main(String[] args){
        int[] array = {1,15,-6,7,10};

//        printArray(array);
       // findEle(array,4);
//        findMinEle(array);
        //findMinEleIndex(array);
//        swapArray(array,0,1);

//        int minIndex = findMinIndexInSubArray(array,0, 3);
//        selectionSort(array);
        //reverseArray(array);
        // reverseArraySwaps(array);
       // bubbleSort(array);

//         array = deleteElePosition(array,4);
//         printArray(array);
//        insertElement(array,5,5,1);

//        array = insertElement(array,100,3);
//        assert array != null;
//        printArray(array);
        insertionSort(array);
    }
}
