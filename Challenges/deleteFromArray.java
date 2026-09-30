package Challenges;

import java.util.Scanner;

public class deleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = ArrayUtlity.inputArray();
        System.out.print("Enter the num you want :");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new Array");
        ArrayUtlity.displayArray(newArr);
        input.close();
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete){
        int occ = OccurranceArray.noOfOccurance(numArr, numToDelete);
        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length-occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if(numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
