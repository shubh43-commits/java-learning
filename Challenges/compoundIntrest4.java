package Challenges;

import java.util.Scanner;

public class compoundIntrest4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal Amt: ");
        double p = input.nextDouble();

        System.out.print("ENter the intrest Rate: ");
        double r = input.nextDouble();

        System.out.print("ENter the give Time: ");
        double t = input.nextDouble();
        // for total amount
        double TotalValue = p * Math.pow((1 + r/100),t);
        System.out.println("Total Value: "+ TotalValue);


        double compoundInterest = TotalValue - p;
        System.out.println("Compound interest is: " + compoundInterest);
        input.close();



        input.close();
    }
}
