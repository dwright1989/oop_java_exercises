package com.techreturners.cats;

public abstract class Feline implements Cat {

    public boolean sleeping;
    public int averageHeight;
    public String setting;


    @Override
    public boolean isAsleep() {
        return sleeping;
    }

    @Override
    public void goToSleep() {
        sleeping = true;
    }

    @Override
    public void wakeUp(){
        sleeping = false;
    }

    public abstract void eat();

    @Override
    public void run() {

    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String getSetting() {
        return setting;
    }
}
