package Challenges;

import java.util.Scanner;

public class search2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Search \n");

        Scanner input = new Scanner(System.in);
        int [][] numArr = ArrayUtlity.input2DArray();
        System.out.print("Enter the num you want to search: ");
        int num = input.nextInt();

        boolean isFound = search(numArr, num);
        if (isFound) {
            System.out.println("Your num is Found.");
        }else {
            System.out.println(" Your num is not found.");
        }
        input.close();
    }
    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j<numArr[i].length) {
                if (numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
