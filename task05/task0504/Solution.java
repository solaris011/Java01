package es.codegym.task.pro.task05.task0504;

/* 
Arrays combinados
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[20];

        for (int i = 0; i < resultArray.length; i++) {

            if (i<10) {
                resultArray[i] = firstArray[i];
            } else {
                resultArray[i] = secondArray[i-10];
            }
            System.out.print(resultArray[i] + ", ");
        }
        //
    }
}
