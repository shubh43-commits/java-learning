package Challenges;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to leap year calcultor..");
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the year u want to check: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year == 0 && year % 100 != 0)){
            System.out.println("Your year is a leap Year");
        }else{
            System.out.println("Your Year is not leap Year");  
        }  
        input.close();
    }
}

