package com.iquestgroup.remotelearning;

public class Amphibian {
    protected String speciesType;
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
        System.out.println("The amphibian is jumping");
    }

    public void eat() {
        System.out.println("The amphibian is eating");
    }

    protected void swim() {
        System.out.println("The amphibian is swimming");
    }
}
