package com.company;

public class Run {
    final static double DEFAULT_WEATHER = 0;
    int numberOfRunners;
    String stadiumName;
    double Weather;

    public Run(int numberOfRunners, String stadiumName, double weather) {
        this.numberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        this.Weather = weather;
    }
    public Run(int numberOfRunners, String stadiumName) {
        this(numberOfRunners, stadiumName, DEFAULT_WEATHER);
    }

    public Run(Run run) {
        this.numberOfRunners = run.numberOfRunners;
        this.stadiumName = run.stadiumName;
        this.DEFAULT_WEATHER = run.Weather;
    };

    public Run(int numberOfRunners) {
        return this.numberOfRunners;
    }

    public Run(String stadiumName) {
        return this.stadiumName;
    }

    public Run(double DEFAULT_WEATHER) {
        return this.DEFAULT_WEATHER;
    }
}
