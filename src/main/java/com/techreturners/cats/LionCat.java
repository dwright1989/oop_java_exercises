package com.techreturners.cats;

public class LionCat extends Feline{

    public LionCat(){
        this.setting = "Wild";
        this.averageHeight = 1100;
    }
    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
