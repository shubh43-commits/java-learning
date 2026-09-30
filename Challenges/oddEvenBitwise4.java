package Challenges;

import java.util.Scanner;

public class oddEvenBitwise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Odd Even Calcultor..");
        System.out.print("Enter YOur Num: ");
        int num = input.nextInt();

        if((num & 1) == 1) {
            System.out.println("Num is Odd");
        }else{
            System.out.println("num is Even");
        }
        input.close();
    }
}
