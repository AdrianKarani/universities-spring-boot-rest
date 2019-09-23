package com.ics.demo.oop;

public class Mammal extends Animal implements AnimalInterface{

    private int numberOfLegs;
    private int gestationPeriod;

    public Mammal(String name, TypeOfEye typeOfEye, int numberOfLegs, int gestationPeriod) {
        super(name, typeOfEye);
        this.numberOfLegs = numberOfLegs;
        this.gestationPeriod = gestationPeriod;
    }

    //overloading
    public Mammal(String name, TypeOfEye typeOfEye, int gestationPeriod) {
        super(name, typeOfEye);
        this.gestationPeriod = gestationPeriod;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getGestationPeriod() {
        return gestationPeriod;
    }

    public void setGestationPeriod(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "numberOfLegs=" + numberOfLegs +
                ", gestationPeriod=" + gestationPeriod +
                ", name='" + name + '\'' +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Mammals walk....");
    }
}
