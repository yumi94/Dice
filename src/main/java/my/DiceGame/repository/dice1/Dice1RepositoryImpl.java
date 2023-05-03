package my.DiceGame.repository.dice1;

import lombok.extern.slf4j.Slf4j;
import my.DiceGame.domain.dice1.DiceHistory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Repository
public class Dice1RepositoryImpl implements Dice1Repository {

    private static final Map<Integer, Integer> dice1Repository = new HashMap<>();

    @Override
    public void save(DiceHistory diceHistory) {

        Map<Integer, Integer> dice1NumHistory = diceHistory.getHistory();

        for(Integer key : dice1NumHistory.keySet()) {
            dice1Repository.put(key, dice1NumHistory.get(key));
        } // for
    } // save

    @Override
    public DiceHistory findAll() {
        DiceHistory diceHistory = new DiceHistory();
        diceHistory.setHistory(dice1Repository);

        return diceHistory;

    } // findAll
} // end class
