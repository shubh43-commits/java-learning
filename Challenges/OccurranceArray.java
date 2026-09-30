package Challenges;

import java.util.Scanner;


public class OccurranceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcomr to Array Occurance\n");
        int [] numArr = ArrayUtlity.inputArray(input);
        System.out.println("Enter the num You want to find: ");
        int num = input.nextInt();

        int occurrence = noOfOccurance(numArr, num);
        System.out.println("Your elements was found "+ occurrence + " times in the array");
        
    }

    public static int noOfOccurance(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while (i< numArr.length) {
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
