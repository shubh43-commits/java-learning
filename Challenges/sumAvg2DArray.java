package Challenges;

public class sumAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum And avg od 2d Array\n");
        int [][] numArr = ArrayUtlity.input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Your sum of Array is: "+ sum);
        System.out.println("Your average of Array is: "+ avg);
    }
    public static long sum(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j<numArr[i].length) {
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] numArr){
        if (numArr.length == 0) {
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum(numArr) / size;
    }
}
