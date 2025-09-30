package mian.java.com.navin.tictactoe.controllers;

import java.util.List;
import mian.java.com.navin.tictactoe.models.Game;
import mian.java.com.navin.tictactoe.models.Player;
import mian.java.com.navin.tictactoe.stratagies.WinningStrategy;

public class GameController {

    public Game startGame(int dimensionsOfTheGmae, List<Player> players,
            List<WinningStrategy> winningStrategies) {
        return Game.getBuilder()
                .setDimensionsOfTheGmae(dimensionsOfTheGmae)
                .setPlayers(players)
                .setWinningStratgies(winningStrategies)
                .build();

    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();

    }
}
