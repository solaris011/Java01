package es.codegym.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Collections;

/* 
Estudiando los metodos de la clase Collections. Parte 1
*/

public class Solution {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if(destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("source does not fit in dest");
        }
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}
