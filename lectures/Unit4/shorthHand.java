package lectures.Unit4;

import java.util.Scanner;

public class shorthHand {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int x1 = input.nextInt();
        a = a + x1; //without shorthhand
        System.out.println("Addition is:" + a);
        
    
        System.out.print("Enter Your Choice: ");
        int x2 = input.nextInt();
        //shorthhand
        a -= x2;
        System.out.println("Substract is:" + a);
        

        System.out.print("Enter Your Choice: ");
        int x3 = input.nextInt();
        a *= x3;
        System.out.println("Multiple is:" + a);

        System.out.print("Enter Your Choice: ");
        int x4 = input.nextInt();
        a /= x4;
        System.out.println("Division is:" + a);

        System.out.print("Enter Your Choice: ");
        int x5 = input.nextInt();
        a %= x5;
        System.out.println("Modulus  is:" + a);

    input.close();
        
    }

}
