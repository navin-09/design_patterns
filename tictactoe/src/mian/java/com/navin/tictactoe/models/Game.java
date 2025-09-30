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

}
