package Challenges;

public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reverse \n");
        int[] numArr = ArrayUtlity.inputArray();
        reverse(numArr);
        System.out.print("Your reverse Array is: ");
        ArrayUtlity.displayArray(numArr);
    }
    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i ] = swap;
            i++;
        }
    }
}
