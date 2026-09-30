package Challenges;
import java.util.Scanner;


public class PalidromeNum5 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palidrome NUmber");
        System.out.print("Enter your Digits: ");
        int num = input.nextInt();
        boolean isPalidrome = ispalidrome(num);
        if(isPalidrome){
            System.out.println("Your num is a palidrome num");
        }else{
            System.out.println("Not palidrome num");
        }
        input.close();
    }

    public static boolean ispalidrome(int num){

        return num == reverse(num);
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
