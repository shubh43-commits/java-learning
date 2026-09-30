package Challenges;

import java.util.Scanner;

public class floatMul4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Choice: ");
        float a = input.nextFloat();

        System.out.print("Enter Your Choice: ");
        float b = input.nextFloat();

        float mul = a*b;
        System.out.println("Product of two no. is: "+mul);

        input.close();
    }
}
