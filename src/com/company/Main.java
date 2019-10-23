/* ДЗ_Перегрузка методов ShowTime_1
package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here
        showTime(2);
        showTime(2,5);
        showTime(2,5 ,8);
    }

    public static void showTime(int hours) {
        System.out.println(hours + " -часов, " + 0 + " -минут, " + 0 + " -секунд ");
    }
    public static void showTime(int hours, int minutes) {
        System.out.println(hours + " -часов, " + minutes + " -минут, " + 0 + " -секунд ");
    }
    public static void showTime(int hours, int minutes, int seconds) {
        System.out.println(hours + " -часов, " + minutes + " -минут, " + seconds + " -секунд ");

    }
}
 */
/* Циклы_2
package com.company;

 public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 5;
        for (int x = 0; count >= 1; x = x + 1){
            count = count - 1;
            if ((count % 2) != 0) System.out.println("нечетные числа count - " + count);
                    else if (count > 0) System.out.println("четные числа count - " + count);
                    if (count == 0) System.out.println("нулевое значение числа count - " + count);

        }

    }
}
*/

/* ДЗ_Массивы_3
package com.company;
 public class Main {
    public static void main(String[] args) {
        String [] array = {" I ", " like ", " to ", " program ", " in ", " Java "};
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if(i == 5 || i == 1 || i == 0)
                result = result + array[i];
        }
        System.out.println(result);
    }
}
*/


/*
                                            //RadioStation_4
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

                                            //Run_5
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

                                            //Hause_6
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

                                            //Conference_7
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

                                            //Car_8
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
                                        //Laptop_9
/*
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
 */
                                    //Airplane_10
/*
package com.company;

public class Main {

    private static Object Airoplane;

    public static void main(String[] args) {
        // write your code here
        com.company.Airplane S7 = new Airplane();
        com.company.Airplane UralAirlines = new Airplane();

        System.out.println(S7.equals(UralAirlines));
    }
}
 */
                                        //Math_11
/*
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Object object1 = new Math();
        Object object2 = new Math();
        object1.equals(object2);
        System.out.println(object1.equals(object2));

        System.out.println();
    }
}
*/
                                        //1) Stack_12
/*
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(" main ");
        method1();
        System.out.println(" main ");
    }
    public static void method1(){
        System.out.println(" method1 ");
        method2();
        System.out.println(" method1 ");
    }
    public static void method2(){
        System.out.println(" method2 ");
        method3();
        System.out.println(" method2 ");

    }
    public static void method3(){
        System.out.println(" method3 ");
    }
}
 */

                                //2) Stack_12
/*
package com.company;

public class Main {

        public static void method1() {
        System.out.println(" method1 ");
        method2();
        method1();
    }

        public static void method2() {
        method3();
        System.out.println(" method2 ");
    }

    public static void method3() {
        System.out.println(" method3 ");
    }

    public static void main(String[] args) {
        // write your code here
        method1();
    }
}
*/

                                //Hash Code (частично)_13
/*
package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here;
        //Dog dog1 = new Dog("Rex1", 10, 20);
        //Dog dog2 = new Dog("Rex2",10,20);
        //System.out.println(dog1.hashCode());
        //System.out.println(dog2.hashCode());

        List<Dog> list = new ArrayList<>();
        list.add(new Dog());
        list.add(new Dog());
        System.out.println();
        Set<Dog> set = new HashSet<Dog>();
        set.add(new Dog());
        set.add(new Dog());
        System.out.println();
    }
}
 */
                                    // Grandfather_14
/*
package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Grandfather grandfather = new Grandfather();
        grandfather.knowsWholsLenin();
        System.out.println(" grandfather.knowsWholsLenin" );

        Father father = new Father();
        father.listenTheBeatles();
        father.knowsWholsLenin();
        System.out.println(" father.listenTheBeatles " + " father.knowsWholsLenin ");

        Son son = new Son();
        son.learnJava();
        son.knowsWholsLenin();
        son.listenTheBeatles();
        System.out.println(" son.learnJava " + " son.knowsWholsLenin " + " son.listenTheBeatles ");

        Daughter daughter = new Daughter();
        daughter.learnJavaAndSql();
        daughter.knowsWholsLenin();
        daughter.listenTheBeatles();
        System.out.println(" daughter.learnJavaAndSql " + " daughter.knowsWholsLenin " + " daughter.listenTheBeatles ");
    }
}
*/

                                    // TireFitting_15
/*
package com.company;
    public class Main {

    public static void main(String[] args) {
        // write your code here
        TireFitting.makeService();
    }
}
*/

                                    // Heroes_16 (запутался..)
/*
package com.company;


  import mutants.Deadpool;
  import mutants.Spiderman;
  import people.IronMan;
  import people.Superman;

  public class Main {

    public static void main(String[] args) {
        // write your code here
       Spiderman spiderman = new Spiderman();
        System.out.println(spiderman.breath);
        System.out.println(new Deadpool());
        System.out.println(new Superman());
        System.out.println(new IronMan());
    }

}
*/


