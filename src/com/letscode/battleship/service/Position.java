package com.letscode.battleship.service;

import com.letscode.battleship.utils.Writer;

public class Position {

    public static int changeLine(String line) {
        int boardLine = 0;

        switch (line) {
            case "A":
                boardLine = 3;
                break;
            case "B":
                boardLine = 5;
                break;
            case "C":
                boardLine = 7;
                break;
            case "D":
                boardLine = 9;
                break;
            case "E":
                boardLine = 11;
                break;
            case "F":
                boardLine = 13;
                break;
            case "G":
                boardLine = 15;
                break;
            case "H":
                boardLine = 17;
                break;
            case "I":
                boardLine = 19;
                break;
            case "J":
                boardLine = 21;
                break;
        }
        return boardLine;
    }

    public static int changeColumn(int column) {
        int boardColumn = 0;

        switch (column) {
            case 0:
                boardColumn = 3;
                break;
            case 1:
                boardColumn = 5;
                break;
            case 2:
                boardColumn = 7;
                break;
            case 3:
                boardColumn = 9;
                break;
            case 4:
                boardColumn = 11;
                break;
            case 5:
                boardColumn = 13;
                break;
            case 6:
                boardColumn = 15;
                break;
            case 7:
                boardColumn = 17;
                break;
            case 8:
                boardColumn = 19;
                break;
            case 9:
                boardColumn = 21;
                break;
        }
        return boardColumn;
    }

    public static boolean wasPlaced(char[][] gameBoard, int line, int column) {
        if (line == 0 || column == 0) {
            Writer.invalidPosition();
            return false;
        }

        if (gameBoard[line][column] == 'N') {
            Writer.occoupiedPosition();
            return false;
        }

        gameBoard[line][column] = 'N';
        return true;
    }
}
