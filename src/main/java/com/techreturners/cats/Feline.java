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

    public abstract void eat();

    @Override
    public void run() {

    }
}
