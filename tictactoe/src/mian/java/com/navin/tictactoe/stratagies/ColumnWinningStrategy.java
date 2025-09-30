package mian.java.com.navin.tictactoe.stratagies;

import mian.java.com.navin.tictactoe.models.Board;
import mian.java.com.navin.tictactoe.models.Move;

public class ColumnWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWin(Move move, Board board) {
        return false;
    }

    @Override
    public void handleUndoMove(Move move, Board board) {

    }

}
