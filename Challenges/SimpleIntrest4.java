package Challenges;

import java.util.Scanner;

public class SimpleIntrest4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal Amt: ");
        double p = input.nextDouble();

        System.out.print("ENter the intrest Rate: ");
        double r = input.nextDouble();

        System.out.print("ENter the give Time: ");
        double t = input.nextDouble();

        double i = p*r*t;
        System.out.println("Simple intrest is: "+ i);

        double TotalValue = p+i;
        System.out.print("Total Value: "+ TotalValue);

        input.close();

    }
}
