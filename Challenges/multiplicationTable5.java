package Challenges;

import java.util.Scanner;

public class multiplicationTable5 {
    public static void main(String[] args) {
        System.out.println("Multplication table for give num..");

        //taking input of num
        Scanner input = new Scanner(System.in);
        System.out.print("Ente your num: ");
        int num = input.nextInt();
        input.close();;
        printMulTable(num);//pass the function here
    }
    
    //Created function for multiplication of table 
    public static void printMulTable(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + "*"+ i + "=" + (num*i));
            i++;
        }
    }
}
