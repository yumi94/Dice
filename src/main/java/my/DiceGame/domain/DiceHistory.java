package my.DiceGame.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class DiceHistory {

    private Map<Integer, Integer> history;
} // end class