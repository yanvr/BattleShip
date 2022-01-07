package com.letscode.battleship.service;

import com.letscode.battleship.entity.Player;
import com.letscode.battleship.utils.RandomNumber;
import com.letscode.battleship.utils.Reader;
import com.letscode.battleship.utils.Writer;

public class Core {

    public static void runGame(char[][] humanGameBoard, char[][] cpuGameBoard) {
        // Define a quantidade de submarinos
        final int gameSize = 10;
        boolean isRunning = true;

        Player human = new Player("human", humanGameBoard);
        Player cpu = new Player("cpu", cpuGameBoard);

        while (isRunning) {

            int quantityHumanSubmarines = gameSize;

            do {
                int line;
                int column;

                line = Position.changeLine(Reader.readLine());
                column = Position.changeColumn(Reader.readColumn());

                if (Position.wasPlaced(humanGameBoard, line, column)) quantityHumanSubmarines--;

                Writer.showGameBoard(humanGameBoard);

            } while (quantityHumanSubmarines > 0);


            int quantityCpuSubmarines = gameSize;

            do {

                int line;
                int column;

                line = Position.changeColumn(RandomNumber.generate());
                column = Position.changeColumn(RandomNumber.generate());

                if (Position.wasPlaced(cpuGameBoard, line, column)) quantityCpuSubmarines--;

            } while (quantityCpuSubmarines > 0);


            do {
                Writer.showGameBoard(human.gameBoard);
                // Imprimir aqui para auxiliar no teste
                // Writer.showGameBoard(cpuGameBoard);

                int line;
                int column;

                // HUMAN
                Writer.playerTurn();

                line = Position.changeLine(Reader.readLine());
                column = Position.changeColumn(Reader.readColumn());

                human.shootTheBoat(cpu.gameBoard, line, column);
                if (human.score == gameSize){
                    Writer.endGame();
                    isRunning = false;
                } else {
                    // CPU
                    Writer.cpuTurn();

                    line = Position.changeColumn(RandomNumber.generate());
                    column = Position.changeColumn(RandomNumber.generate());

                    cpu.shootTheBoat(human.gameBoard, line, column);
                    if (cpu.score == gameSize){
                        Writer.endGame();
                        isRunning = false;
                    }
                }
                Writer.scoreBoaard(human, cpu);
            } while (isRunning);
            if (human.score > cpu.score) {
                Writer.winner(human);
            } else {
                Writer.winner(cpu);
            }
            Writer.showGameBoard(human.gameBoard);
            Writer.showGameBoard(cpu.gameBoard);
        }
    }
}
