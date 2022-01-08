package com.letscode.battleship.utils;

import com.letscode.battleship.entity.Player;

public class Writer {

    public static final String INSERT_LINE = "Informe uma linha (letra de A à J):";
    public static final String INSERT_COLUMN = "Informe uma coluna (número  de 0 à 9:";
    public static final String INVALID = "A posição informada é inválida, informe novamente.";
    public static final String OCCUPIED = "A posição informada está ocupada, informe outra posição.";
    public static final String ALREADY_INFORMED = "A posição digitada já foi informada.";
    public static final String SHOT_IN_THE_WATER = "O tiro atingiu a água.";
    public static final String TARGET_WAS_SHOT_DOWN = "O tiro atingiu a água";
    public static final String PLAYER_TURN = "*** Rodada do jogador ***";
    public static final String CPU_TURN = "*** Rodada do CPU ***";

    public static void insertPosition(String position) {
        System.out.printf("%s ", position);
    }

    public static void positionStatus(String status) {
        System.out.printf("%s %n", status);
    }

    public static void whoseTurnItIs(String player) {
        System.out.printf("%s %n", player);
    }

    public static void showGameBoard(char[][] board) {
        for (char[] line : board) {
            for (char column : line) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static void scoreBoard(Player player1, Player player2) {
        System.out.println("********** Placar **********");
        System.out.print("*** " + player1.name + " " + player1.score + " X ");
        System.out.print(player2.score + " " + player2.name + " ***\n");
        System.out.println("****************************\n");
    }

    public static void winner(Player player) {
        System.out.println("########## CHAMPION ##########");
        System.out.println("########## " + player.name + " ##########");
        System.out.println("##############################");
    }

    public static void endGame() {
        System.out.println("*** O jogo acabou ***");
    }

}

