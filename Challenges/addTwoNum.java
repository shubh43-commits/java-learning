package Challenges;

import java.util.Scanner;

public class addTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your First No.: ");
        int a = input.nextInt();

        System.out.print("Please Enter Your Second No.: ");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("Sum Of Two No: "+c);

        input.close();
    }
}
