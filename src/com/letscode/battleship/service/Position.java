package com.letscode.battleship.service;

import com.letscode.battleship.utils.Writer;

import java.util.HashMap;
import java.util.Map;

public class Position {

    public static int changeLine(String line) {
        int boardLine = 0;

        HashMap<String, Integer> gameBoardLines = new HashMap<>();
        gameBoardLines.put("A", 3);
        gameBoardLines.put("B", 5);
        gameBoardLines.put("C", 7);
        gameBoardLines.put("D", 9);
        gameBoardLines.put("E", 11);
        gameBoardLines.put("F", 13);
        gameBoardLines.put("G", 15);
        gameBoardLines.put("H", 17);
        gameBoardLines.put("I", 19);
        gameBoardLines.put("J", 21);

        for (Map.Entry<String, Integer> gameBoardLine : gameBoardLines.entrySet()) {
            if (gameBoardLine.getKey().equals(line)) {
                boardLine = gameBoardLine.getValue();
                break;
            }
        }
        return boardLine;
    }

    public static int changeColumn(String column) {
        int boardColumn = 0;

        HashMap<String, Integer> gameBoardColumns = new HashMap<>();
        gameBoardColumns.put("0", 3);
        gameBoardColumns.put("1", 5);
        gameBoardColumns.put("2", 7);
        gameBoardColumns.put("3", 9);
        gameBoardColumns.put("4", 11);
        gameBoardColumns.put("5", 13);
        gameBoardColumns.put("6", 15);
        gameBoardColumns.put("7", 17);
        gameBoardColumns.put("8", 19);
        gameBoardColumns.put("9", 21);

        for (Map.Entry<String, Integer> gameBoardColumn : gameBoardColumns.entrySet()) {
            if (gameBoardColumn.getKey().equals(column)) {
                boardColumn = gameBoardColumn.getValue();
                break;
            }
        }
        return boardColumn;
    }

    public static boolean wasPlaced(char[][] gameBoard, int line, int column) {
        if (line == 0 || column == 0) {
            Writer.positionStatus(Writer.INVALID);
            return false;
        }

        if (gameBoard[line][column] == 'N') {
            Writer.positionStatus(Writer.OCCUPIED);
            return false;
        }

        gameBoard[line][column] = 'N';
        return true;
    }
}
