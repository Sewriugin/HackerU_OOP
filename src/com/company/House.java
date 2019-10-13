package com.company;

public class House {
    String color;
    int height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String t = "light";
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height * 100;
    }
}


