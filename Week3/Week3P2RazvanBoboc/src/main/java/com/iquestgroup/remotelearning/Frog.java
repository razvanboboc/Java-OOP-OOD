package com.iquestgroup.remotelearning;

public class Frog extends Amphibian {
    public Frog(String speciesType) {
        super(speciesType);
    }
    public void setSpeciesType(String speciesType) {
        this.speciesType = speciesType;
    }

    public void getSpeciesType() {
        System.out.println(speciesType);
    }

    public void jump() {
        System.out.println("The frog is jumping");
    }

    public void eat() {
        System.out.println("The frog is eating");
    }

    public void swim(){
        super.swim();
    }
}
