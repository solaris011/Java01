package es.codegym.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Trabajar o no trabajar, esa es la cuestión
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 20 || age > 60 )
            System.out.println("No tienes que trabajar");
    }
}
