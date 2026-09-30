package Challenges;

import java.util.Scanner;

public class oddEven4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your num: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Num is Even");
        }else{
            System.out.println("Num is odd");
        }
        input.close();
    }
}
