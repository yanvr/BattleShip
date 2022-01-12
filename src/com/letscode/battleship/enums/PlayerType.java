package com.letscode.battleship.enums;

public enum PlayerType {
    HUMAN("Jogador"), CPU("CPU");

    private String type;

    PlayerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
