package Challenges;

import java.util.Scanner;

public class greatestNum4 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        System.out.print("Please Enter Your First num: ");
        int num1 = input.nextInt();

        System.out.print("Please Enter Your Second Num: ");
        int num2 = input.nextInt();

        System.out.print("Please Enter Your Third Num: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + "is the Greatest number");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + "is the greater Number");
        }else{
            System.out.println(num3 + " is the greater number");
        }

    input.close();
    }
}
