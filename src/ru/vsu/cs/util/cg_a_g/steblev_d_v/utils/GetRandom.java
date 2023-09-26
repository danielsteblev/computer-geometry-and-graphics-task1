package ru.vsu.cs.util.cg_a_g.steblev_d_v.utils;

public class GetRandom {

    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
