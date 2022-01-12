package com.letscode.battleship.utils;

import java.util.Random;

public class Generator {

    public static Random random;

    public static String randomNumber() {
        random = new Random();
        return String.valueOf(random.nextInt(9));
    }
}
