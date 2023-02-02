package com.techreturners.cats;

public class CheetahCat extends Feline{

    public CheetahCat(){
        this.setting = "Wild";
        this.averageHeight = 1200;
    }
    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
