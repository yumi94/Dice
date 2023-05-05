package my.DiceGame.service;

import my.DiceGame.domain.Dice;
import my.DiceGame.domain.DiceHistory;

public interface Dice1Service {

    void save(Dice dice);

    DiceHistory loadHistory();
} // end interface
