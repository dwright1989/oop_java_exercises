package com.techreturners.cats;

public abstract class Feline implements Cat {

    public boolean sleeping;
    public int height;
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

    public int getHeight() {
        return height;
    }

    public String getSetting() {
        return setting;
    }
}
