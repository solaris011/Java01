package es.codegym.task.pro.task12.task1201;

/* 
Autoboxing
*/

public class Solution {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Integer integerValueBox = Integer.valueOf(intValue);

    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Long longValueBox = Long.valueOf(longValue);
    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);
    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
