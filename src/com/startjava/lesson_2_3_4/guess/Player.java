package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;

    private int numberTry;

    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int index, int number) {
        numbers[index] = number;
    }

    public void setNumberTry(int numberTry) {
        this.numberTry = numberTry;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public int getNumberTry() {
        return numberTry;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numberTry);
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, numberTry, 0);
    }
}