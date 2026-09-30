package Challenges;

import java.util.Scanner;

public class bitWiseAnd4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Showcasing Bitwise And Operator\n");
        System.out.print("Enter First Num: ");
        int first = input.nextInt();
        System.out.print("Now, Enter other num: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is: " + result);

        input.close();
    }
}
