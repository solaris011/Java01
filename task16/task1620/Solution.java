package es.codegym.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Otro patrón simple
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String time = dtf.format(zonedDateTime);
        System.out.println(time);
    }
}
