package com.techreturners.cats;

interface Cat {

    public boolean sleeping = false;
    public int height = 0;
    public String setting = "Domestic";

    public boolean isAsleep();
    public void eat();
    public void sleep();
    public void run();

}
