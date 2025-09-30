package mian.java.com.navin.tictactoe.stratagies.botPlayingStrategies;

import mian.java.com.navin.tictactoe.models.Board;
import mian.java.com.navin.tictactoe.models.Move;
import mian.java.com.navin.tictactoe.models.Cell;
import mian.java.com.navin.tictactoe.models.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellState() == CellState.EMPTY) {
                    return new Move(cell, null);
                }
            }
        }
        return null;

    }

}
