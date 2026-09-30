package Challenges;

import java.util.Scanner;

public class sumOfDigit5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits");
        System.out.println("Enter Your Num: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of Digit is: "+ sum);

        input.close();
    }
    
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
