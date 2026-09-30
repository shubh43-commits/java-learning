package lectures.Unit5;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {3,6,8,87,65,4,68,23};
        System.out.println("Welcome to Array Searching\n");
        System.out.print("Enter the num you want to search: ");
        int num = input.nextInt();

        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Num is an Arr");
        }else {
            System.out.println("Num not found in Arr");
        }
        input.close();
    }

        public static boolean isFound(int[] arr, int num){
        int index = 0;

        while (index < arr.length) {
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;

    }
}
