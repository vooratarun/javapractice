package class1;

public class BasicRecursion {


    public  static int factorial(int n) {
        if(n == 0) return 1;
        if(n == 1) return  1;

        return n * factorial(n-1);
    }

    public static int  fib(int n) {
        if(n <=1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        int fact5 = factorial(5);
        System.out.println(fact5);
    }
}
