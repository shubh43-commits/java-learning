package Challenges;

import java.util.Scanner;

public class reverseDigits5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse the digit");
        System.out.print("Enter your Digits: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of Your Num is: "+ reverse);

        input.close();
    }
    public static int reverse(int num){
        int newNum = 0;
        while (num>0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
