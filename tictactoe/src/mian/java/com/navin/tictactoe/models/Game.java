package mian.java.com.navin.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

import mian.java.com.navin.tictactoe.stratagies.WinningStrategy;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private int nextPlayerMoveIndex;
    private Player winner;
    private List<WinningStrategy> winningStratgies;

    private Game(List<Player> players, List<WinningStrategy> winningStratgies, int dimensionsOfTheGmae) {
        this.players = players;
        this.winningStratgies = winningStratgies;
        this.nextPlayerMoveIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.board = new Board(dimensionsOfTheGmae);
        this.moves = new ArrayList<Move>();

    }

    public static GameBuilder getBuilder() {
        return new GameBuilder();

    }

    public static class GameBuilder {
        private List<Player> players;
        private List<WinningStrategy> winningStratgies;
        private int dimensionsOfTheGmae;

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setWinningStratgies(List<WinningStrategy> winningStratgies) {
            this.winningStratgies = winningStratgies;
            return this;
        }

        public GameBuilder setDimensionsOfTheGmae(int dimensionsOfTheGmae) {
            this.dimensionsOfTheGmae = dimensionsOfTheGmae;
            return this;
        }

        public void Validate() {
            if (players == null || players.size() < 2) {
                throw new IllegalArgumentException("At least two players are required to start the game.");
            }
            if (winningStratgies == null || winningStratgies.isEmpty()) {
                throw new IllegalArgumentException("At least one winning strategy is required to start the game.");
            }
            if (dimensionsOfTheGmae < 3) {
                throw new IllegalArgumentException("Game dimensions must be at least 3.");
            }
        }

        public Game build() {
            Validate();
            return new Game(this.players, this.winningStratgies, this.dimensionsOfTheGmae);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<WinningStrategy> getWinningStratgies() {
        return winningStratgies;
    }

    public void setWinningStratgies(List<WinningStrategy> winningStratgies) {
        this.winningStratgies = winningStratgies;
    }

    public void printBoard() {
        board.printBoard();
    }

    public boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row >= board.getSize()) {
            return false;
        }
        if (col >= board.getSize()) {
            return false;
        }

        return board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    public boolean checkWinner(Board board, Move move) {
        for (WinningStrategy winningStrategy : winningStratgies) {
            if (winningStrategy.checkWinner(move, board)) {
                return true;
            }
        }
        return false;
    }

    public void undo() {
        if (moves.isEmpty()) {
            System.out.println("No moves to undo");
            return;
        }
        Move move = moves.get(moves.size() - 1);
        moves.remove(move);
        Cell cell = move.getCell();

        cell.setPlayer(null);
        cell.setCellState(CellState.EMPTY);

        nextPlayerMoveIndex -= 1;
        nextPlayerMoveIndex = (nextPlayerMoveIndex + players.size()) % players.size();

        for (WinningStrategy winningStrategy : winningStrategies) {
            winningStrategy.handleUndo(board, move);
        }
    }

    public void makeMove() {
        Player currentMovePlayer = players.get(nextPlayerMoveIndex);
        System.out.println("It is " + currentMovePlayer.getName() + "'s turn. Please make your move");
        Move move = currentMovePlayer.makeMove();

        if (!validateMove(move)) {
            System.out.println("Invalid Move! Please try again");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToBeUpdated = board.getBoard().get(row).get(col);
        cellToBeUpdated.setCellState(CellState.FILLED);
        cellToBeUpdated.setPlayer(currentMovePlayer);

        Move finalMoveObject = new Move(cellToBeUpdated, currentMovePlayer);
        moves.add(finalMoveObject);

        nextPlayerMoveIndex += 1;
        nextPlayerMoveIndex %= players.size();

        if (checkWinner(board, finalMoveObject)) {
            gameState = GameState.WIN;
            winner = currentMovePlayer;
        } else if (moves.size() == board.getSize() * board.getSize()) {
            gameState = GameState.DRAW;
        }

        System.out.println("Player " + currentMovePlayer.getName() + " moved at " + move.getCell().getRow() + " , "
                + move.getCell().getCol());
    }

}
