package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;

import java.util.Random;

public class SixSidedDie implements DieRoller {
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
