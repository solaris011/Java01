package es.codegym.task.pro.task16.task1605;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Тeletransportador de bolsillo
*/

public class Solution {

    public static final String INVENTED = "Please pick up your pocket teleporter. Thanks for waiting!";
    public static final String NOT_INVENTED = "Sorry, teleportation hasn't been invented yet. Come back in 10 years.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //currentDay.getTime();
        while (!isTeleportInvented(currentDay)) {
            currentDay.add(Calendar.YEAR, 10);
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        if (currentDay.after(INVENTION_DAY)) {
            System.out.println(INVENTED);
            return true;
        } else {
            System.out.println(NOT_INVENTED);
            return false;
        }
    }
}
