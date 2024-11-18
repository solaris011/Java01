package es.codegym.task.pro.task14.task1409;

/* 
Pasando a través de nosotros mismos
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("Unlucky!");
        }
        System.out.println("Your lucky number: " + luckyNumber);
    }
}
