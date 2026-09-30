package Challenges;

import java.util.Scanner;;

public class leftShift4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Scowcase of left shift operator...");
        System.out.print("Enter Your num: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Your Result is: "+result);

        input.close();
    }
}