package com.letscode.battleship.entity;

import com.letscode.battleship.utils.Writer;

public class Player {

    public String name;
    public int score = 0;
    public char[][] gameBoard;

    public Player(String name,char[][] gameBoard){
        this.name = name;
        this.gameBoard = gameBoard;
    }

    public void shootTheBoat(char[][] enemyBoard, int line, int column) {
        if (line == 0 || column == 0) {
            Writer.positionStatus(Writer.INVALID);

        } else if (enemyBoard[line][column] == ' ') {
            enemyBoard[line][column] = '-';
            Writer.positionStatus(Writer.SHOT_IN_THE_WATER);

        } else if (enemyBoard[line][column] == 'N') {
            enemyBoard[line][column] = '*';
            Writer.positionStatus(Writer.TARGET_WAS_SHOT_DOWN);
            score++;

        } else {
            Writer.positionStatus(Writer.ALREADY_INFORMED);
        }
    }
}
