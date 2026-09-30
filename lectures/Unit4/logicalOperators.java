package lectures.Unit4;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a Female? (true/false)");
        boolean isFemale = input.nextBoolean();

        if(age < 5){
            System.out.println("You got 75% Discount");
        }else if(isFemale){
            System.out.println("You got 50% Discount");
        }else if(age > 60 && !isFemale){
            System.out.println("Ypu got 25% Discount");
        }else{
            System.out.println("You got no Discount");
        }
        input.close();
    }
}
