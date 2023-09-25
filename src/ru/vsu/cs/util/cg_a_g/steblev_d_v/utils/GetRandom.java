package ru.vsu.cs.util.cg_a_g.steblev_d_v.utils;

import java.util.concurrent.ThreadLocalRandom;

public class GetRandom {
    private static final int MIN = 1;
    private static final int MAX = 700;

    public static int getRandom(){
        int randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        return randomNum;
    }
}
