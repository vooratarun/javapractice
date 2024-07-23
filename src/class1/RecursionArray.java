package class1;

public class RecursionArray {

    public  static void printArray(int[] array) {
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void printArrayRecursive(int[] array,int i) {

        if(i == array.length) return;
        System.out.print(array[i]+" ");
        printArrayRecursive(array,i+1);
    }

    public static int findMinRecur(int[] arr, int i) {

        if(i == arr.length -1){
            return  arr[i];
        }

        int minRest = findMinRecur(arr,i+1);

        if(arr[i] < minRest) {
            return arr[i];
        } else {
            return minRest;
        }
    }

    public int findMinRecursion(int[] array,int i) {
        if(array.length-1 == i)
            return array[i];

        int minRest = findMinRecursion(array,i+1);

        if(array[i] < minRest){
            return  minRest;
        }else {
            return array[i];
        }
    }

    public static void reverseArray(int[ ] array, int left, int right) {

        if(left > right) {
            return;
        }
        int temp = array[left];
        array[left]= array[right];
        array[right] = temp;
        reverseArray(array, left+1, right-1);
    }

    public static void main(String[] args) {
        int[] array = {-64, 25, 12, 22, 11};

        //int minEle = findMin(array,0);
        //System.out.println(minEle);

//        reverseArray(array,0,array.length-1);
//        printArray(array);

        printArrayRecursive(array,0);
    }
}
