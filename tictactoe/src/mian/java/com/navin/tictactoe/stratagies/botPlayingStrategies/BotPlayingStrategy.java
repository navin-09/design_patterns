package mian.java.com.navin.tictactoe.stratagies.botPlayingStrategies;

import mian.java.com.navin.tictactoe.models.Board;
import mian.java.com.navin.tictactoe.models.Move;
import mian.java.com.navin.tictactoe.models.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);

}
