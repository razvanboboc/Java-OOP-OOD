package com.iquestgroup.remotelearning;

public class Amphibian {
    private String speciesType;
    public Amphibian(String speciesType) {
        this.speciesType = speciesType;
    }

    public void setSpeciesType(String speciesType) {
        this.speciesType = speciesType;
    }

    public void getSpeciesType() {
        System.out.println(speciesType);
    }

    public void jump() {
        System.out.println("Jumping..");
    }

    public void eat() {
        System.out.println("Eating..");
    }
}
