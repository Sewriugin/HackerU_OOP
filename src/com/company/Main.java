/*
                                            //RadioStation
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RadioStation FM = new RadioStation("FM",88.8f,"fm");
        //FM.frequency = 88.8f; без конструктора
        RadioStation AM = new RadioStation("AM",101.2f,"am");
        //AM.frequency = 101.2f; без конструктора
        RadioStation FM_AM = new RadioStation(100f);

        FM.name();
        FM.frequency();
        FM.format();

        AM.name();
        AM.frequency();
        AM.format();

        FM_AM.frequency();
    }
}
 */


                                            //Run
/*
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Run run1 = new Run(10, "+++", 0);
        Run run2 = new Run(5, "---");
        System.out.println("Кличество бегунов - " + run1.numberOfRunners);
        System.out.println("Погода - " + run1.Weather);
        System.out.println("Кличество бегунов - " + run2.numberOfRunners);
        System.out.println("Погода - " + run2.Weather);
        Run run3 = new Run(run1);
        System.out.println("Кличество бегунов - " + run3.numberOfRunners);
        System.out.println("Погода - " + run3.Weather);
    }
}
 */

                                            //Hause
/*
package com.company;

        public class Main {

    public static void main(String[] args) {
        // write your code here
        Hause dom1 = new Hause();
        Hause dom2 = new Hause();

        dom1.setColor("green");
        dom1.setHeight(14);
        dom2.setColor("red");
        dom2.setHeight(17);

        System.out.println(dom1.getColor() + " " + dom1.getHeight());
        System.out.println(dom2.getColor() + " " + dom2.getHeight());
    }
}
 */

                                            //Conference
/*package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Conference.PERIOD = 1;
        Conference.showPeriod();
        Conference medicalConference = new Conference();
        medicalConference.setTopic("New in therapy");
        medicalConference.showTopic();
        Conference IT_CONFERENCE = Conference.IT_CONFERENCE();
        System.out.println(IT_CONFERENCE.getTopic());
    }
}
 */

                                            //Car
/*
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car1 = new  Car(0,100);
        //Car car2 = car1; //1-ая часть
        //System.out.println("maxSpeed car1 " + car1.maxSpeed + "; maxSpeed car2 " + car2.maxSpeed);
        //car2.setMaxSpeed(200);
        //System.out.println("maxSpeed car1 " + car1.maxSpeed + "; maxSpeed car2 " + car2.maxSpeed);

        car1.setMaxSpeed(100);
        Car car2 = new Car(0, 100);
        System.out.println("maxSpeed car1 " + car1.maxSpeed + "; maxSpeed car2 " + car2.maxSpeed);
        car2.setMaxSpeed(200);
        System.out.println("maxSpeed car1 " + car1.maxSpeed + "; maxSpeed car2 " + car2.maxSpeed);

    }
}
 */
                                        //Laptop
package com.company;

public class Main {

    private static Object Laptop;

    public static void main(String[] args) {
        // write your code here
        com.company.Laptop Samsung = new Laptop("silver", "Samsung");
        com.company.Laptop HP = new Laptop("silver", "HP");

        //1) System.out.println(Samsung==HP);
        //1) System.out.println(Samsung.equals(HP));
        //2) Samsung.setBrand("HP");
        //2) Laptop HP = new Laptop("silver","Samsung");
        //System.out.println(Samsung==HP);
        System.out.println(Samsung.equals(HP));
    }
}
