package Challenges;

import java.util.Scanner;

public class prime5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Num..");
        System.out.print("Please Enter Your num: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Your num is prime");
        }else{
            System.out.println("Your num is not prime");
        }
        input.close();

    }
    public static boolean isPrime(int num){
        int i = 2;
        while (i < num) {
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
