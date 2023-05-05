package my.DiceGame.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.DiceGame.domain.Dice;
import my.DiceGame.domain.DiceHistory;
import my.DiceGame.service.Dice1Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class Dice1Controller {

    private final Dice1Service dice1Service;

    @GetMapping("/dice1")
    public String diceMain() {

        return "dice1/startDice";
    } // diceMain

    @GetMapping("/dice1/lets-dice")
    public String myDice1 (Model model) {

        Dice dice1 = new Dice();
        DiceHistory diceHistory = new DiceHistory();

        int randomNum = (int)(Math.random()*6)+1;
        dice1.setNumber(randomNum);

        model.addAttribute( "dice1", dice1);

        dice1Service.save(dice1);

        DiceHistory storagediceHistory = dice1Service.loadHistory();
        model.addAttribute("dice1History", storagediceHistory);

        return "dice1/rolldice";
    } // myDice1

} // end class
