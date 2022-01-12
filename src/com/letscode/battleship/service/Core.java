package com.letscode.battleship.service;

import com.letscode.battleship.entity.Player;
import com.letscode.battleship.utils.Generator;
import com.letscode.battleship.utils.Reader;
import com.letscode.battleship.utils.Writer;

public class Core {

    public static void runGame(Player human, Player cpu) {
        final int gameSize = 10;
        boolean isRunning = true;

        while (isRunning) {

            int line;
            int column;

            int quantityHumanSubmarines = gameSize;

            do {
                Writer.showGameBoard(human.getGameBoard(), Writer.HUMAN);
                Writer.showsTheAmountOfBoatsLeft(quantityHumanSubmarines);

                line = Changer.changeLine(Reader.readPosition(Writer.INSERT_LINE));
                column = Changer.changeColumn(Reader.readPosition(Writer.INSERT_COLUMN));

                if (Positioner.wasPlaced(human.getGameBoard(), line, column)) quantityHumanSubmarines--;


            } while (quantityHumanSubmarines > 0);


            int quantityCpuSubmarines = gameSize;

            do {

                line = Changer.changeColumn(Generator.randomNumber());
                column = Changer.changeColumn(Generator.randomNumber());

                if (Positioner.wasPlaced(cpu.getGameBoard(), line, column)) quantityCpuSubmarines--;

            } while (quantityCpuSubmarines > 0);

            do {
                Writer.showGameBoard(human.getGameBoard(), Writer.HUMAN);

                // HUMAN
                Writer.whoseTurnItIs(Writer.PLAYER_TURN);

                line = Changer.changeLine(Reader.readPosition(Writer.INSERT_LINE));
                column = Changer.changeColumn(Reader.readPosition(Writer.INSERT_COLUMN));

                Positioner.PositionShot(cpu.getGameBoard(), human, line, column);

                if (human.getScore() == gameSize){
                    Writer.endGame();
                    isRunning = false;
                } else {
                    // CPU
                    Writer.whoseTurnItIs(Writer.CPU_TURN);

                    line = Changer.changeColumn(Generator.randomNumber());
                    column = Changer.changeColumn(Generator.randomNumber());

                    Positioner.PositionShot(human.getGameBoard(), cpu, line, column);

                    if (cpu.getScore() == gameSize){
                        Writer.endGame();
                        isRunning = false;
                    }
                }
                Writer.scoreBoard(human, cpu);
            } while (isRunning);
            if (human.getScore() > cpu.getScore()) {
                Writer.winner(human);
            } else {
                Writer.winner(cpu);
            }
            Writer.showGameBoard(human.getGameBoard(), Writer.HUMAN);
            Writer.showGameBoard(cpu.getGameBoard(), Writer.CPU);
        }
    }
}