package com.letscode.battleship.utils;

import java.util.Locale;
import java.util.Scanner;

public class Reader {

    public static Scanner gameScanner = new Scanner(System.in);

    public static String readPosition(String position) {
        Writer.insertPosition(position);
        return gameScanner.next().toUpperCase(Locale.ROOT);
    }
}
