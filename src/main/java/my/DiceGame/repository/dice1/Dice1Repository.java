package my.DiceGame.repository.dice1;

import my.DiceGame.domain.dice1.DiceHistory;

public interface Dice1Repository {

    void save(DiceHistory diceHistory);

    DiceHistory findAll();
} // end interface
