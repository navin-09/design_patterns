package mian.java.com.navin.tictactoe.models;

import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.size = size;
        this.board = new java.util.ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Cell> row = new java.util.ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell(i, j));
            }
            board.add(row);
        }
    }

    public void printBoard() {
        for (List<Cell> row : board) {
            for (Cell cell : row) {
                cell.display();
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

}
