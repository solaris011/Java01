package es.codegym.task.pro.task13.task1328;

import java.util.*;

/* 
Los logros
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "One small step");
        map.put(5, "Gimme 5");
        map.put(10, "Perfect 10");
        map.put(50, "50 shades of coding");
        map.put(100, "Centurion");
        map.put(200, "200% efficiency");
        map.put(300, "The 300 Spartans");
        map.put(400, "400m run");
        map.put(500, "Bugs don't belong here");
        map.put(600, "600 shots per minute");
        map.put(700, "Hunting season");
        map.put(800, "Coder of Steel");
        map.put(900, "A bazillion bugs later");

        int tasksCount = 150;

        SortedMap<Integer, String> reachedAchievements = getReachedAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : reachedAchievements.entrySet()) {
            System.out.printf("You earned the \"%s\" achievement for completing %d tasks%n", entry.getValue(), entry.getKey());
        }

        System.out.printf("%nYou have currently completed %d tasks%n%n", tasksCount);


        SortedMap<Integer, String> futureAchievements = getFutureAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : futureAchievements.entrySet()) {
            System.out.printf("You will earn the \"%s\" achievement if you complete %d tasks%n", entry.getValue(), entry.getKey());
        }

    }

    public static SortedMap<Integer, String> getReachedAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        SortedMap<Integer, String> logros = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() <= tasksCount) {
                logros.put(entry.getKey(), entry.getValue());
            }
        }
        return logros;
    }

    public static SortedMap<Integer, String> getFutureAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        SortedMap<Integer, String> faltantes = new TreeMap<Integer, String>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > tasksCount) {
                faltantes.put(entry.getKey(), entry.getValue());
            }
        }
        return faltantes;
    }
}