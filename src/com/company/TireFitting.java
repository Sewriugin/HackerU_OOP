package com.company;

public class TireFitting {
    private static void removeTheWheel() {
        System.out.println(" removeTheWheel ");
    }

    private static void fixheel() {
        System.out.println(" fixWheel ");
    }

    private static void checkQuality() {
        System.out.println(" checkQuality ");
    }

    private static void installWheel() {
        System.out.println(" installWheel ");
    }

    public static void makeService() {
        removeTheWheel();
        fixheel();
        checkQuality();
        installWheel();
    }
}