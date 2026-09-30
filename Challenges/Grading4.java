package Challenges;

import java.util.Scanner;

public class Grading4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator..");
        System.out.print("Please Enter Your Percentage: ");
        float percentage = input.nextFloat();

        if(percentage >= 90){
            System.out.println("Great You got A");
        }else if(percentage>=75){
            System.out.println("Good, You got B");
        }else if(percentage >= 60){
            System.out.println("You have got C, Work harder");
        }else if(percentage>= 30){
            System.out.println("Congratulation You got D 😂");
        }else{
            System.out.println("😁🤣 You are fail...");
        }

        input.close();
    }
}
