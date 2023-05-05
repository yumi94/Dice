package my.DiceGame.repository;

import my.DiceGame.domain.DiceHistory;

public interface Dice1Repository {

    void save(DiceHistory diceHistory);

    DiceHistory findAll();
} // end interface
