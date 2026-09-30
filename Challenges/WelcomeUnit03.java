package Challenges;

import java.util.Scanner;

public class WelcomeUnit03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter YOur Name: ");
        String name = sc.nextLine();
        System.out.println("Welcome "+ name + " to KG Coding");

        sc.close();
    }
}
