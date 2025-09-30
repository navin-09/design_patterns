package tictactoe.src.mian.java.com.navin.tictactoe.stratagies;

import tictactoe.src.mian.java.com.navin.tictactoe.models.Board;
import tictactoe.src.mian.java.com.navin.tictactoe.models.Move;

public class DiagonalWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWin(Move move, Board board) {
        return false;
    }

    @Override
    public void handleUndoMove(Move move, Board board) {

    }

}
