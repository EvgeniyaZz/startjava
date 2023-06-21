package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int numberTry;
    private int quantityWins;

    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[numberTry - 1];
    }

    public boolean addNumber(int number) {
        if(number > 0 && number <= 100) {
            numbers[numberTry] = number;
            numberTry++;
            return true;
        } else {
            return false;
        }
    }

    public void setQuantityWins() {
        quantityWins++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numberTry);
    }

    public int getNumberTry() {
        return numberTry;
    }

    public int getQuantityWins() {
        return quantityWins;
    }

    public void clear() {
        Arrays.fill(numbers, 0, numberTry, 0);
        numberTry = 0;
        quantityWins = 0;
    }
}