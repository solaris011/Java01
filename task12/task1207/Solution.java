package es.codegym.task.pro.task12.task1207;

/* 
El número menor
*/

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The first number is greater than or equal to the second number.");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second ? true : false;
    }
}
