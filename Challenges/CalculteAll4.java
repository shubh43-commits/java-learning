package Challenges;

import java.util.Scanner;

public class CalculteAll4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First digit: ");
        int a = input.nextInt();

        System.out.print("Enter Sceond digit: ");
        int b = input.nextInt();


        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("Addition is:" + add);
        System.out.println("Subsrtaction is: "+ sub);
        System.out.println("Multiple is: "+ mul);
        System.out.println("Division is: "+ div);
        System.out.println("Modulus is: "+ mod);



        input.close();
    }
}
