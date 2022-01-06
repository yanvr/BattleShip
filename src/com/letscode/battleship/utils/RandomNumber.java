package com.letscode.battleship.utils;

import java.util.Random;

public class RandomNumber {

    public static Random random;

    public static int generate() {
        random = new Random();
        return random.nextInt(9);
    }
}
