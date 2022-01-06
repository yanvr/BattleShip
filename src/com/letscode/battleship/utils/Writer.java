package com.letscode.battleship.utils;

public class Writer {

    public static void insertLine() {
        System.out.print("Informe uma linha (letra de A à J): ");
    }

    public static void insertColumn() {
        System.out.print("Informe uma coluna (número  de 0 à 9: ");
    }

    public static void invalidPosition() {
        System.out.println("A posição informada é inválida, informe novamente");
    }

    public static void occoupiedPosition() {
        System.out.println("A posição informada está ocupada, informe outra posição");
    }

    public static void shootInTheWater() {
        System.out.println("O tiro atingiu a água");
    }

    public static void targetWasShotDown() {
        System.out.println("O alvo foi encontrado e abatido");
    }

    public static void showGameBoard(char[][] board) {
        for (char[] line : board) {
            for (char column : line) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static void playerTurn() {
        System.out.println("*** Rodada do jogador ***");
    }

    public static void cpuTurn() {
        System.out.println("*** Rodada do CPU ***");
    }
}
