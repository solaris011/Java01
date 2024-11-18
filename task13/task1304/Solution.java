package es.codegym.task.pro.task13.task1304;

import java.util.*;

/* 
Convirtiendo un iterador a un bucle for-each
*/

public class Solution {

    public static void printList(ArrayList<String> words) {
        for (String str: words)
        {
            System.out.println(str);
        }
        /*
        for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            System.out.println(word);
        }
        */
    }

    public static void printHashSet(HashSet<String> words) {
        //Iterator<String> iterator = words.iterator();
        for (String str: words)
        {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "I think this will be a new feature. Just don't tell anyone that it was an accident.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
