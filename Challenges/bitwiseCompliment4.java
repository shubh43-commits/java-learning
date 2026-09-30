package Challenges;

import java.util.Scanner;

public class bitwiseCompliment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Scowcase of NOt/Compliment operator...");
        System.out.print("Enter Your num: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your Result is: "+result);

        input.close();
    }
}
