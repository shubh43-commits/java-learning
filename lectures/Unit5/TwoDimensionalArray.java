package lectures.Unit5;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //way 1
        int [][] myArr = new int[5][4];
        myArr[0][0] = 6;
        //way 2
        int[][] arr = {{1,2,3}, {4,5,3}, {7,8,9}};
        System.out.println(arr[0].length);

        //for travesal 
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}