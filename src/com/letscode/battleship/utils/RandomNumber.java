package com.letscode.battleship.utils;

import java.util.Random;

public class RandomNumber {

    public static Random random;

    public static String generate() {
        random = new Random();
        return String.valueOf(random.nextInt(9));
    }
}
