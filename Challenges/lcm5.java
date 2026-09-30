package Challenges;

import java.util.Scanner;

public class lcm5 {
    public static void main(String[] args) {
        System.out.println("Welcome to Lcm");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your num: ");
        int first = input.nextInt();

        System.out.print("Ente your num: ");
        int second = input.nextInt();
        
        int lcm = lcm(first, second);
        System.out.println("LCM of num is: "+ lcm);

        input.close();
    }
    public static int lcm(int first, int second){
        int i = 1;
        while (true) {
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
