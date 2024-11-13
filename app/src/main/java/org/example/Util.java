package org.example;

import java.util.Random;

public class Util {
    public static Boolean getNullableValue() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            return rand.nextBoolean();
        } else {
            return null;
        }
    }
}
