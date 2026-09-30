package Challenges;

import java.util.Scanner;

public class perimeterOfRectangle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the length of Rectangle: ");
        int l = input.nextInt();

        System.out.print("Please Enter the Width of the Rectangle: ");
        int w = input.nextInt();
        
        int P = 2*(l+w);
        System.out.println("Perimeter Of Rectangle is: "+ P);


        input.close();
    }
}
