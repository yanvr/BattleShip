package com.letscode.battleship.service;

import com.letscode.battleship.utils.RandomNumber;
import com.letscode.battleship.utils.Reader;
import com.letscode.battleship.utils.Writer;

public class Core {

    public static void runGame(char[][] humanGameBoard, char[][] cpuGameBoard) {

        boolean isRunning = true;

        while (isRunning) {

            int quantityHumanSubmarines = 3;

            do {
                int line;
                int column;

                line = Position.changeLine(Reader.readLine());
                column = Position.changeColumn(Reader.readColumn());

                if (Position.wasPlaced(humanGameBoard, line, column)) quantityHumanSubmarines--;

                Writer.showGameBoard(humanGameBoard);

            } while (quantityHumanSubmarines > 0);


            int quantityCpuSubmarines = 3;

            do {

                int line;
                int column;

                line = Position.changeColumn(RandomNumber.generate());
                column = Position.changeColumn(RandomNumber.generate());

                if (Position.wasPlaced(cpuGameBoard, line, column)) quantityCpuSubmarines--;

            } while (quantityCpuSubmarines > 0);


            do {
                Writer.showGameBoard(humanGameBoard);

                int line;
                int column;

                // HUMAN
                Writer.playerTurn();

                line = Position.changeLine(Reader.readLine());
                column = Position.changeColumn(Reader.readColumn());

                Position.shootTheBoat(cpuGameBoard, line, column);

                // CPU
                Writer.cpuTurn();

                line = Position.changeColumn(RandomNumber.generate());
                column = Position.changeColumn(RandomNumber.generate());

                Position.shootTheBoat(humanGameBoard, line, column);
            } while (true);
        }
    }
}
