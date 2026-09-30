package Challenges;

import java.util.Scanner;

public class positiveNegativeZero4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checkup\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();

        if (num > 0 ) {
            System.out.println("YOur Number is Positive");
        }else if(num == 0){
            System.out.println("Your Number is Zero");
        }else{
            System.out.println("Your Number is Negative");
        }
        input.close();
    }
}
