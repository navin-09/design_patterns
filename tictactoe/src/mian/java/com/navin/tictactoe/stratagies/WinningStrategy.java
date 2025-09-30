package mian.java.com.navin.tictactoe.stratagies;

import mian.java.com.navin.tictactoe.models.Board;
import mian.java.com.navin.tictactoe.models.Move;

public interface WinningStrategy {

    public boolean checkWin(Move move, Board board);

    public void handleUndoMove(Move move, Board board);

}
