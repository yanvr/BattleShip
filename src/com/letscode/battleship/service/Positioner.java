package com.letscode.battleship.service;

import com.letscode.battleship.entity.Player;
import com.letscode.battleship.utils.Writer;

public class Positioner {

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

    public static void PositionShot(char[][] enemyGameBoard, Player player, int line, int column) {
        if (line == 0 || column == 0) {
            Writer.positionStatus(Writer.INVALID);

        } else if (enemyGameBoard[line][column] == ' ') {
            enemyGameBoard[line][column] = '-';
            Writer.positionStatus(Writer.SHOT_IN_THE_WATER);

        } else if (enemyGameBoard[line][column] == 'N') {
            enemyGameBoard[line][column] = '*';
            Writer.positionStatus(Writer.TARGET_WAS_SHOT_DOWN);
            player.setScore(player.getScore() + 1);

        } else {
            Writer.positionStatus(Writer.ALREADY_INFORMED);
        }
    }
}
