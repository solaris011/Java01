package es.codegym.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Mostrando los elementos de un conjunto
*/

public class Solution {

    public static void print(HashSet<String> words) {
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Programming is usually taught using examples.".split(" ")));
        print(words);
    }
}
