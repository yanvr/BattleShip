package com.letscode.battleship;

import com.letscode.battleship.entity.GameBoard;
import com.letscode.battleship.service.Core;

public class BattleShipApplication {

    public static void main(String[] args) {

        GameBoard humanGameBoard = new GameBoard();
        GameBoard cpuGameBoard = new GameBoard();

        Core.runGame(humanGameBoard.board, cpuGameBoard.board);
    }
}
