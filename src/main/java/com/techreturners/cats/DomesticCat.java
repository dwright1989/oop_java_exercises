package com.techreturners.cats;

public class DomesticCat extends Feline {

    public DomesticCat(){
        this.setting = "Domestic";
        this.averageHeight = 23;
    }

    @Override
    public String eat() {
        return "prrrrrrrrr";
    }

}
