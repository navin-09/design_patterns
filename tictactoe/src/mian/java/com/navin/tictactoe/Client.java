package mian.java.com.navin.tictactoe;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import mian.java.com.navin.tictactoe.controllers.GameController;
import mian.java.com.navin.tictactoe.models.Player;
import mian.java.com.navin.tictactoe.models.PlayerType;
import mian.java.com.navin.tictactoe.models.Symbol;
import mian.java.com.navin.tictactoe.stratagies.ColumnWinningStrategy;
import mian.java.com.navin.tictactoe.stratagies.DiagonalWinningStrategy;
import mian.java.com.navin.tictactoe.stratagies.RowWinningStrategy;
import mian.java.com.navin.tictactoe.stratagies.WinningStrategy;
import mian.java.com.navin.tictactoe.models.Game;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameController gameControler = new GameController();
        System.out.println("Welcome to Tic Tac Toe!");
        try {
            int dimensionsOfTheGmae = 3;
            List<Player> players = new ArrayList<>();

            players.add(new Player(1, "Navin", PlayerType.HUMAN, new Symbol('X')));
            players.add(new Player(2, "Bot", PlayerType.BOT, new Symbol('0')));

            List<WinningStrategy> winningStrategies = List.of(new RowWinningStrategy(), new ColumnWinningStrategy(),
                    new DiagonalWinningStrategy());

            Game game = gameControler.startGame(dimensionsOfTheGmae, players,
                    winningStrategies);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            throw e;
        }

    }

}
