package lectures.Unit4;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to driving licennce portal");
        System.out.print("Please Enter Your age: ");
        int age = input.nextInt();

// ==, !=, >, <, <=, >= 
        if(age >= 18){
            System.out.println("You are Eligible");
        }else{
            System.out.println("You are not Eligible");
        }

        input.close();
    }
}
