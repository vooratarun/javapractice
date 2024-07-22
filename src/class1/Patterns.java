package class1;

public class Patterns {

    public static void printMultiTable(int mul) {
        for (int j =1; j < 10; j++){
            System.out.println(mul+ " X " +j + " = " +(mul * j));
        }
    }

//    x
//    x x
//    x x x
//    x x x x
//    x x x x x

    public static void printPattern() {
        for(int i= 1; i<=5;i++){
            for(int j =1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printPattern2() {
        for(int i= 1; i<=5;i++){
            for(int j =5; j>=i;j--){
                System.out.print(5-j+1);
            }
            System.out.println();
        }
    }



    public static void printPattern3() {
        for(int i = 0; i < 5;i++) {

            for(int j =0; j< 5-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j< 2*i+1;j++){
                System.out.print("*");
            }

            for (int j =0; j<5-i-1; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
//        printMultiTable(4);
//          printPattern();
//          printPattern2();
        printPattern3();
    }
}
