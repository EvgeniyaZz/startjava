package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, float height,
            float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println(modelName + " - движение активировано");
    }

    public String toString() {
        return modelName + ": \nMark - " + mark + "\nOrigin - " + origin + "\nHeight - "
                + height + "\nWeight - " + weight + "\nStrength - " + strength + "\nArmor - "
                + armor;
    }
}