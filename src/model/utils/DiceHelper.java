package model.utils;

import java.util.Random;

public class DiceHelper {
    private DiceHelper(){
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    public static int rollDices(){
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }
}
