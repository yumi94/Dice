package my.DiceGame.service.dice1;

import my.DiceGame.domain.dice1.Dice;
import my.DiceGame.domain.dice1.DiceHistory;

public interface Dice1Service {

    void save(Dice dice);

    DiceHistory loadHistory();
} // end interface
