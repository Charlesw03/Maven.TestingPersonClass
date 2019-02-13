package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private String name;
    private int age;
    private int heightInFeet;
    private String eyeColor;
    private String hairColor;
    private Boolean hasInny;
    private Double weightinLbs;



    public Person() {


    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
     this.name =  name;

    }

    public void setAge(int age) {
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getHeightInFeet() {
        return heightInFeet;
    }

    public void setHeightInFeet(int heightInFeet) {
        this.heightInFeet = heightInFeet;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Boolean getHasInny() {
        return hasInny;
    }

    public void setHasInny(Boolean hasInny) {
        this.hasInny = hasInny;
    }

    public Double getWeightinLbs() {
        return weightinLbs;
    }

    public void setWeightinLbs(Double weightinLbs) {
        this.weightinLbs = weightinLbs;
    }
}
