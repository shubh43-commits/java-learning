package Challenges;

import java.util.Scanner;

public class ageGroup {
    public static void main(String[] args) {
        System.out.println("Welcome to categorize person According to age group");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if(age <= 13){
            System.out.println("Child");
        }else if(age <= 20){
            System.out.println("Teen");
        }else if(age <= 60){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }

        input.close();
    }
    
}
