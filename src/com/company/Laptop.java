package com.company;

import java.util.Objects;

public class Laptop {
    public String color = "Silver";
    public String brand;

    public Laptop(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(color, laptop.color); //&&
                //Objects.equals(brand, laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand);
    }
}
/*
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
 */
