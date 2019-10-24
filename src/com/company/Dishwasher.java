package com.company;

public class Dishwasher extends Appliance {
    @Override
    public void doWork() {
        super.doWork();
        System.out.println(" Мою посуду ");
    }
}
