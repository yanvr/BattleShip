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
            Writer.invalidPosition();
        } else if (enemyBoard[line][column] == ' ') {
            enemyBoard[line][column] = '-';
            Writer.shootInTheWater();
        } else if (enemyBoard[line][column] == 'N') {
            enemyBoard[line][column] = '*';
            Writer.targetWasShotDown();
            score++;
        }
    }
}
