package lectures.Unit5;

public class method {
    public static void main(String[] args) {
        // System.out.println("in main method");
        // greerUser();
        // System.out.println("Method calling complete");
        // greerUser();
        // firstPattern();
        // secondPattern();
        // thirdPattern();        
        PrintPattern();
    }

    public static void greerUser(){
        System.out.println("Good Morning...");
    }

    public static void firstPattern(){
        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *\n");
    }

    public static void secondPattern(){
        System.out.println("* * * * *\n* * * *\n* * *\n* *\n*\n");
    }

    public static void thirdPattern(){
        System.out.println("         *\n       * *\n     * * *\n   * * * *\n * * * * *");
    } 

    public static void PrintPattern(){
        int row = 0;
        while (row < 10) {
            System.out.print("*");
            int i =0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
 
}
