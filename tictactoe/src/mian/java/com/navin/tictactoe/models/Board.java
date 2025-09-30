package mian.java.com.navin.tictactoe.models;

import java.util.List;

public class Board {
    private int Size;
    private List<List<Cell>> board;

    public Board(int size) {
        Size = size;
        this.board = board;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

}
