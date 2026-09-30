package Challenges;

public class palindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Pslindrome checker..");
        int[] numArr = ArrayUtlity.inputArray();
        boolean isPalin = isPalindrone(numArr);
        if (isPalin) {
            System.out.println("Your Array is Palindrome");
        }else {
            System.out.println("Your Array is not Palindrome");
        }
    }

    public static boolean isPalindrone(int[] numArr){
        int i = 0;
        while (i < numArr.length/2) {
            if(numArr[i] != numArr[numArr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
