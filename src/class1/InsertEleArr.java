package class1;

public class InsertEleArr {

    public  static void printArray(int[] array, int n){
        for(int i=0; i < n;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void insertEleArray(int[] array, int n, int ele, int position){

       int[] newarray = new int[array.length +1];

       for(int i =0; i< array.length +1;i++){
           if(i < position) {
               newarray[i] = array[i];
           } else if (i == position) {
               newarray[i] = ele;
           } else {
               newarray[i] = array[i-1];
           }

       }
       printArray(newarray, array.length);


    }


    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        array[3] = 5;
        array[4] = 6;



//        printArray(array,array.length -1);
//        insertEleArray(array, array.length-1,100,0);
//        printArray(array,array.length);
        insertEleArray(array,array.length,100,1);


    }
}
