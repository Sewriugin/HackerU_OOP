package com.company;

public class Run {
    static double DEFAULT_WEATHER = 0;
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
    }

    public static void main(String[] args) {

    }

//TODO забыли одну скобку закрывающуюся снизу
}
    /*
    public Run(int numberOfRunners) {
        return;

    }
    public Run(String stadiumName) {
        return;
    }
    public Run(double weather) {
        return;
    }


}*/
//TODO не закрыли комментарий снизу * + /

