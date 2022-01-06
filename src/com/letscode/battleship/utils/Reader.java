package com.letscode.battleship.utils;

import java.util.Locale;
import java.util.Scanner;

public class Reader {

    public static Scanner scanner = new Scanner(System.in);

    public static int readColumn() {
        Writer.insertColumn();
        return scanner.nextInt();
    }

    public static String readLine() {
        Writer.insertLine();
        return scanner.next().toUpperCase(Locale.ROOT);
    }
}
