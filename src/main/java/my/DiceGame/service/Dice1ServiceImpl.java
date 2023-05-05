package my.DiceGame.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.DiceGame.domain.Dice;
import my.DiceGame.domain.DiceHistory;
import my.DiceGame.repository.Dice1Repository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class Dice1ServiceImpl implements Dice1Service {

    private final Dice1Repository dice1Repository;

    @Override
    public void save(Dice dice) {
        int number = dice.getNumber();
        DiceHistory diceHistory = dice1Repository.findAll();

        Map<Integer, Integer> dice1NumHistory = diceHistory.getHistory();

        if(dice1NumHistory.isEmpty()) {
            for(int i = 1; i < 7; i++) {
                dice1NumHistory.put(i, 0);
            }
        }
        dice1NumHistory.put(number, dice1NumHistory.get(number) + 1);
        diceHistory.setHistory(dice1NumHistory);

        dice1Repository.save(diceHistory);
    } // save

    @Override
    public DiceHistory loadHistory() {

        return dice1Repository.findAll();
    } // loadHistory
} // end class
