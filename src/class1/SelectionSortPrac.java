package class1;

public class SelectionSortPrac {

    public static   void printArray(int[] array) {
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        int[] array = {10,2,19,18,10};

        for(int i =0; i<array.length;i++){

            int minIndex = i;
            for(int j=i+1; j < array.length;j++){

                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex]= array[i];
            array[i] = temp;

        }

          printArray(array);
    }
}
