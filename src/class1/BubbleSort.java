package class1;

public class BubbleSort {

    public static   void printArray(int[] array) {
//        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    static void bubble(int[] array) {

        printArray(array);

        boolean swapped;
        for(int i = 0; i < array.length -1 ;i++){
            System.out.print(i + " " + (array.length -i -1));
            System.out.println();
            swapped =false;
            for(int  j= 0; j < array.length -1 -i  ;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
            System.out.print("step" +( i + 1)+  ": ");
            printArray(array);

        }

    }

    static void bubblePractice(int[] array){
        for(int i =0; i< array.length-1; i++){

        }
    }
    public static void main(String[] args) {

        int[] array = {10,38,14,56,434,1};
        bubble(array);
//        printArray(array);
    }

}


//How Bubble Sort Works
//Compare adjacent elements: Start with the first two elements in the array.
//Swap if necessary: If the first element is greater than the second, swap them.
//Move to the next pair: Move to the next pair of elements and repeat the comparison and swap if needed.
//Repeat the process: Continue this process for each pair of adjacent elements until the end of the array.
//Iterate: Repeat the entire process for the whole array until no swaps are needed, which indicates that the array is sorted.
//Example
//Consider sorting the array: [5, 2, 9, 1, 5, 6]
//
//First pass:
//Compare 5 and 2, swap them: [2, 5, 9, 1, 5, 6]
//Compare 5 and 9, no swap needed: [2, 5, 9, 1, 5, 6]
//Compare 9 and 1, swap them: [2, 5, 1, 9, 5, 6]
//Compare 9 and 5, swap them: [2, 5, 1, 5, 9, 6]
//Compare 9 and 6, swap them: [2, 5, 1, 5, 6, 9]
//Second pass:
//Compare 2 and 5, no swap needed: [2, 5, 1, 5, 6, 9]
//Compare 5 and 1, swap them: [2, 1, 5, 5, 6, 9]
//Compare 5 and 5, no swap needed: [2, 1, 5, 5, 6, 9]
//Compare 5 and 6, no swap needed: [2, 1, 5, 5, 6, 9]
//Third pass:
//Compare 2 and 1, swap them: [1, 2, 5, 5, 6, 9]
//Compare 2 and 5, no swap needed: [1, 2, 5, 5, 6, 9]
//Compare 5 and 5, no swap needed: [1, 2, 5, 5, 6, 9]
//No more swaps are needed, and the array is sorted.