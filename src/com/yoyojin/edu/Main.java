package com.yoyojin.edu;

import com.yoyojin.edu.dice_game.Game;
import com.yoyojin.edu.dice_game.models.Dice;
import com.yoyojin.edu.dice_game.models.Player;
import com.yoyojin.edu.dice_game.rules.DiceTotalValueWinStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player firstPlayer = new Player("Alex");
        Player secondPlayer = new Player("Max");
        List<Player> players = new ArrayList<>();
        players.add(firstPlayer);
        players.add(secondPlayer);
        Dice d20 = new Dice(1, 20);
        List<Dice> dices = new ArrayList<>();
        dices.add(d20);
        Game game = new Game(players, dices, new DiceTotalValueWinStrategy());
        Player winner = game.play();
        System.out.printf("The winner is %s with score: %d", winner.getName(), winner.getScore());
    }
}