package Challenges;

import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to merging sorted Arrays \n");
        Scanner input = new Scanner(System.in);
        int[] arr1 = ArrayUtlity.inputArray();
        int[] arr2 = ArrayUtlity.inputArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.print("Your merged array is: ");
        ArrayUtlity.displayArray(mergedArr);
        input.close();
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length ||(i < arr1.length && arr1[i] < arr2[j])) {
                newArr [k] = arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }
            
        }

        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }

        return newArr;
    }
}
