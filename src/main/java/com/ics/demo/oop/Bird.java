package com.ics.demo.oop;

public class Bird extends Animal implements AnimalInterface{
    private TypeOfBeak typeOfBeak;

    public Bird(String name, TypeOfEye typeOfEye, TypeOfBeak typeOfBeak) {
        super(name, typeOfEye);
        this.typeOfBeak = typeOfBeak;
    }

    public TypeOfBeak getTypeOfBeak() {
        return typeOfBeak;
    }

    public void setTypeOfBeak(TypeOfBeak typeOfBeak) {
        this.typeOfBeak = typeOfBeak;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "typeOfBeak=" + typeOfBeak +
                ", name='" + name + '\'' +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Birds Fly....");
    }
}
