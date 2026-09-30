package Challenges;

import java.util.Scanner;

public class swapTwoNum {
    public static void main(String[] args) {
        System.out.println("Welcome to swapping..\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of B: ");
        int b = input.nextInt();
        System.out.println("\nBefore Swapping...");
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("\nAfter Swapping Done...");
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);

        input.close();
    }
}
