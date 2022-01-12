package com.letscode.battleship;

import com.letscode.battleship.entity.Player;
import com.letscode.battleship.enums.PlayerType;
import com.letscode.battleship.service.Core;

public class BattleShipApplication {

    public static void main(String[] args) {

        Player human = new Player(PlayerType.HUMAN);
        Player cpu = new Player(PlayerType.CPU);

        Core.runGame(human, cpu);
    }
}
