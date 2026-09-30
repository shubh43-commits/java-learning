package Challenges;

import java.util.Scanner;


public class factorial5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial of Num..");
        System.out.print("Enter Your num: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is: " + fact);
        input.close();
    }
    public static long factorial(int num){// Make Method 
        if (num < 2){ //give the condition if less than 2 factorial is 1
            return 1;// return the value 1
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;  
        }
        return fact;
    }
}
