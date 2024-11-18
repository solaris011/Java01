package es.codegym.task.pro.task13.task1329;

import java.util.*;

/* 
La base de datos no funciona
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(5533, "Head First Java");
        map.put(5536, "Java: A Beginner's Guide");
        map.put(5535, "Java For Dummies");
        map.put(5540, "Java: The Complete Reference");
        map.put(5531, "Core Java");
        map.put(5538, "Java: Programming Techniques");
        map.put(5532, "Java: A Developer's Reference");
        map.put(5539, "Core Java SE 9 for the Impatient");
        map.put(5537, "Effective Java");
        map.put(5534, "Thinking in Java");

        for (int i = getMinId(map); i <= getMaxId(map); i++) {
            System.out.printf("%d %s %n", i, map.get(i));
        }

    }

    public static Integer getMinId(TreeMap<Integer, String> map) {
        Integer minId = map.firstKey();
        return minId;
    }

    public static Integer getMaxId(TreeMap<Integer, String> map) {
        Integer maxId = map.lastKey();
        return maxId;
    }
}