package lectures.Unit5;

public class Array {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 98;
        myArr[2] = 9;
        myArr[1] = 8;
        myArr[3] = 54;
        myArr[4] = 38;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);

        int[] yourArr = {98, 32, 5, 65, 58};
        // int index = 2;

        System.out.println();
        // System.out.println(yourArr[0]);
        // System.out.println(yourArr[1]);
        // System.out.println(yourArr[2]);
        // System.out.println(yourArr[3]);
        // System.out.println(yourArr[4]);
        
        System.out.println();
        System.out.println("Array traversal...");
        
        int index = 0;
        while (index < yourArr.length) {
            System.out.println(yourArr[index]);
            index++;
        }


      String[] strArr =  new String[4];
      strArr[0] = "my String";

      String[] newStrArr = {" First", "Second", "Third"};
      System.out.println();
      System.out.println(newStrArr.length);
    


    }
}
