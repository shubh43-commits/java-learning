package Challenges;

import java.util.Scanner;



public class oddSum5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Add Sum..");
        System.out.println("Enter your num: ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("Odd Sum till"+ num + "is" + sum);
        input.close();
    }

    public static int OddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }

        return sum;
    }
}
