package mian.java.com.navin.tictactoe.stratagies.botPlayingStrategies;

import mian.java.com.navin.tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        if (botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        }
        return null;
    }

}
