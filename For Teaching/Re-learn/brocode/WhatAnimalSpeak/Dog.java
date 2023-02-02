package WhatAnimalSpeak;

public class Dog implements Animal {

    private String name;
    private String colorFeather;

    public Dog() {
        
    }

    public Dog(String name, String colorFeather) {
        this.name = name;
        this.colorFeather = colorFeather;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorFeather() {
        return this.colorFeather;
    }

    public void setColorFeather(String colorFeather) {
        this.colorFeather = colorFeather;
    }

    @Override
    public void speak() {
        System.out.println("Gau Gau Gau");
    }

}
