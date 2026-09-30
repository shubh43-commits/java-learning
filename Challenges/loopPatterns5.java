package Challenges;

import java.util.Scanner;

public class loopPatterns5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = input.nextInt();
        printFirstPattern(rows);
        printReverseHalfPyramid(rows);
        printleftHalfPyramid(rows);
        input.close();
    }

    public static void printFirstPattern(int maxrows){
        System.out.println();
        int rows = 1;
        while (rows <= maxrows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void printReverseHalfPyramid(int maxrows){
        System.out.println();
        int rows = maxrows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
    public static void printleftHalfPyramid(int maxrows){
        System.out.println();
        int rows = maxrows;
        while (rows > 0) {
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }
            //this loop prints starts
            int i = 0;
            while (i <= (maxrows -rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
