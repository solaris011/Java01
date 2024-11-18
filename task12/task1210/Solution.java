package es.codegym.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Collections;

/* 
Flipping data
*/

public class Solution {
    //public static int[] numbers = new int[10];
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        //Collections.reverse(numbers);

        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            //numbers.get(i) = numbers.get(n - i);
            //numbers.get(n - i) = temp;
            numbers.set((n - i ), temp);
        }

    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
