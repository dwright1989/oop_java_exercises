package com.techreturners.cats;

public class DomesticCat extends Feline {

    public DomesticCat(){
        this.setting = "domestic";
        this.averageHeight = 23;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

}
