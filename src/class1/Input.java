package class1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        System.out.println("class 1");

        Scanner scanner = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        // integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);


        // double input
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is " + gpa);

        // character input
        System.out.print("Enter your initial: ");
        char initial = scanner.next().charAt(0);
        System.out.println("Your initial is " + initial);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}

