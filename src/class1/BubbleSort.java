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
