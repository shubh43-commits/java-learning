package Challenges;

import java.util.Scanner;

public class celsius4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit: ");
        double f = input.nextDouble();

        double celsius = (f-32)*5/9;
        System.out.println("Celsios is : "+ celsius);


        input.close();
    }
}
