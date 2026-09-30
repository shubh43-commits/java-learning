package Challenges;

import java.util.Scanner;

public class AreaOfTriangle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of Triangle: ");
        int b = input.nextInt();

        System.out.print("Enter height of Triangle: ");
        int h = input.nextInt();

        double area = 0.5*(b*h);
        System.out.println("Area of triangle is: " + area);
        
        input.close();
    }
    
}
