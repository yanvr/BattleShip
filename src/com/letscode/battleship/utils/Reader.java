package com.letscode.battleship.utils;

import java.util.Locale;
import java.util.Scanner;

public class Reader {

    public static Scanner gameScanner = new Scanner(System.in);

    public static int readColumn() {
        Writer.insertPosition(Writer.INSERT_COLUMN);
        return gameScanner.nextInt();
    }

    public static String readLine() {
        Writer.insertPosition(Writer.INSERT_LINE);
        return gameScanner.next().toUpperCase(Locale.ROOT);
    }
}
