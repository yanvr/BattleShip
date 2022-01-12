package com.letscode.battleship.utils;

import com.letscode.battleship.entity.Player;

public class Writer {

    public static final String INSERT_LINE = "Informe uma linha (letra de A à J):";
    public static final String INSERT_COLUMN = "Informe uma coluna (número  de 0 à 9:";
    public static final String INVALID = "A posição informada é inválida, informe novamente.";
    public static final String OCCUPIED = "A posição informada está ocupada, informe outra posição.";
    public static final String ALREADY_INFORMED = "A posição digitada já foi informada.";
    public static final String SHOT_IN_THE_WATER = "O tiro atingiu a água.";
    public static final String TARGET_WAS_SHOT_DOWN = "O alvo foi abatido.";
    public static final String PLAYER_TURN = "*** Rodada do jogador ***";
    public static final String CPU_TURN = "*** Rodada do CPU ***";
    public static final String HUMAN = "\t\tJOGADOR";
    public static final String CPU = "\t\t  CPU";

    public static void insertPosition(String position) {
        System.out.printf("%s ", position);
    }

    public static void positionStatus(String status) {
        System.out.printf("%s %n", status);
    }

    public static void whoseTurnItIs(String player) {
        System.out.printf("%n%s %n", player);
    }

    public static void showsTheAmountOfBoatsLeft(int quantity) {
        System.out.printf("Restam %d submarinos para serem posicionados.%n", quantity);
    }

    public static void showGameBoard(char[][] board, String player) {
        System.out.println("-----------------------");
        System.out.println(player);
        for (char[] line : board) {
            for (char column : line) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static void scoreBoard(Player player1, Player player2) {
        System.out.printf("%n********** Placar **********%n");
        System.out.print("*** " + player1.getType() + " " + player1.getScore() + " X ");
        System.out.print(player2.getScore() + " " + player2.getType() + " ***\n");
        System.out.println("****************************\n");
    }

    public static void winner(Player player) {
        System.out.println("########## CHAMPION ##########");
        System.out.println("########## " + player.getType() + " ##########");
        System.out.println("##############################");
    }

    public static void endGame() {
        System.out.println("*** O jogo acabou ***");
    }

}

