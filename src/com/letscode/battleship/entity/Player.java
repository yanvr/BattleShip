package com.letscode.battleship.entity;

import com.letscode.battleship.enums.PlayerType;
import com.letscode.battleship.service.GameBoard;
import com.letscode.battleship.utils.Writer;

public class Player {

    private PlayerType type;
    private int score = 0;
    private char[][] gameBoard;

    public Player(PlayerType type){
        this.type = type;
        GameBoard gameBoard = new GameBoard();
        this.gameBoard = gameBoard.board;
    }

    public String getType() {
        return type.getType();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int line, int column, char symbol) {
        gameBoard[line][column] = symbol;
    }
}
