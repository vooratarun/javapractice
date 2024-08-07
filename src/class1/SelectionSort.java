package class1;

public class SelectionSort {


    public int findMinIndex(int[] array,int start, int end){
        int minIndex = start;
        for(int i = start +1; i< end; i++) {
            if(array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int findMaxIndex(int[] array,int start, int end){
        int maxIndex = start;
        for(int i = start +1; i< end; i++) {
            if(array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public void swapTwoIndices(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2]= temp;
    }


    public void sort(int[] array) {
        for(int i =0;i < array.length;i++){
            int minIndex = findMinIndex(array, i, array.length);
            swapTwoIndices(array,i, minIndex);
            printArray(array);
        }
    }

    public void sortRecurse(int[] array, int i) {

        if(array.length == i){
            return;
        }
        int minIndex = findMinIndex(array, i, array.length);
        swapTwoIndices(array,i, minIndex);
        sortRecurse(array,i+1);
    }

    public void sortReverse(int[] array) {
        for(int i =0;i < array.length;i++){
            int maxIndex = findMaxIndex(array, i, array.length);
            swapTwoIndices(array,i, maxIndex);
//            printArray(array);
        }
    }

    public  void printArray(int[] array) {
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }



     public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        int[] array = {9,   7,   5,     3,    1};
//        selectionSort.sort(array);
//        selectionSort.printArray(array);
//        selectionSort.sortReverse(array);
//         selectionSort.sortRecurse(array,0);
//         selectionSort.printArray(array);

        for(int i =0; i< array.length;i++) {

            int minIndex = i;
            for(int j  = i+1; j < array.length;j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex]= array[i];
            array[i] = temp;
            selectionSort.printArray(array);
        }
    }
}
