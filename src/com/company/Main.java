package com.company;
/*
import javax.print.attribute.standard.PresentationDirection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat catMyua = new Cat("red");
        Cat catNoMyua = new Cat ("red", "Basyk");
        Cat catVeryMyua = new Cat("red", "Basyk", 6);
        Cat emtyCat = new Cat();

        System.out.println("");

    }
}
*/

public class Main {
    public static void main(String[] args) {
	// write your code here
        Run run1 = new Run (10, "+++", 0);
        Run run2 = new Run (5, "---");
        System.out.println("Кличество бегунов - " + run1.numberOfRunners);
        System.out.println("Погода - " + run1.Weather);
        System.out.println("Кличество бегунов - " + run2.numberOfRunners);
        System.out.println("Погода - " + run2.Weather);
        Run run3 = new Run(run1);
        System.out.println("Кличество бегунов - " + run3.numberOfRunners);
        System.out.println("Погода - " + run3.Weather);
    }
}