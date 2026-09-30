package Challenges;

import java.util.Scanner;

public class rightShift4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Scowcase of Right Shift operator...");
        System.out.print("Enter Your num: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Your Result is: "+result);

        input.close();
    }
}
