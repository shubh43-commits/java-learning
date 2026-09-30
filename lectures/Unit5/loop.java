package lectures.Unit5;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // int num = 1; //Initalization
        // while (num <= 10000){ //Condition
        //     System.out.println(num);//Actual Work
        //     num = num+1; //Updating the condition
        // }

        // int count = 500;
        // while (count >= 200){
        //     System.out.println(count);
        //     count -= 1;
        // }


        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
            i++;
        }

        input.close();
    }
}
