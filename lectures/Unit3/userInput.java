package lectures.Unit3;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome.. "+ name);
        System.out.println(name + ", Also tell  me Your Age..");
        int age = input.nextInt();
        System.out.println("YOur age is "+ age);

        input.close();
    }
}

