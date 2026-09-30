package lectures.Unit5;

public class parameter {
    public static void main(String[] args) {
        // first way
        // int num = sumTwoNum(40, 6);//when actual value is passed called arguments
        // System.out.println(num);

        //Second Way
        System.out.println(sumOfTwoNum(5, 6));
    }

    // public static int sumTwoNum(int first, int second){//when defenotion got define is called parameter
    //     int sum = first+second;
    //     return sum;
    // }
    // second Way
    public static int sumOfTwoNum(int firstNum, int secondNum){
        System.out.println("First Num Recived: "+ firstNum);
        System.out.print("Second Num Recived: "+ secondNum);
        System.out.println("");
        return firstNum + secondNum;
    }

}
