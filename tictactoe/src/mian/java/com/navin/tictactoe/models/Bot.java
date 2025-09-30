package mian.java.com.navin.tictactoe.models;

import mian.java.com.navin.tictactoe.stratagies.botPlayingStrategies.BotPlayingStrategy;
import mian.java.com.navin.tictactoe.stratagies.botPlayingStrategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(int id, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, PlayerType.BOT, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = new BotPlayingStrategyFactory().getBotPlayingStrategy(botDifficultyLevel);

    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move makeMove(Board board) {
        Move move = botPlayingStrategy.makeMove(board,this);
        return move;
    }

}
