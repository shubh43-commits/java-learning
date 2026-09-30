package lectures.Unit5;

import java.util.Scanner;

public class return5 {
    public static void main(String[] args) {
        greet();    
        
        int first = readNum();
        int second = readNum();

        int sum = first+second;
        System.out.println("Sum Of num is:" +sum);
    }

    public static void greet(){
        System.out.println("Welcome to Calculator\n");
    }
    public static int readNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = input.nextInt();
        input.close();
        return num;
    }
}
