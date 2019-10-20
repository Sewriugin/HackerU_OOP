package com.company;

public class RadioStation {
    public String name;
    public float frequency;
    public String format;


    public RadioStation(String name, float frequency, String format) {
        this.name = name;
        this.frequency = frequency;
        this.format = format;
    }

    public RadioStation(float frequency) {
        this.frequency = frequency;
    }

    void name(){
       System.out.println(" RadioStation " + name);
   }

   void frequency(){
       System.out.println(frequency);
   }

   void format(){
       System.out.println(" Format "+ format);
   }

}
