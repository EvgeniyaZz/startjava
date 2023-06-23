package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    static final int MAX_NUMBER = 100;
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER_TRY = 10;
    private int numberTry;
    private int score;

    private final int[] numbers = new int[10];
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[numberTry - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numberTry);
    }

    public boolean addNumber(int number) {
        if(number >= MIN_NUMBER && number <= MAX_NUMBER) {
            numbers[numberTry] = number;
            numberTry++;
            return true;
        }
        return false;
    }

    public int getNumberTry() {
        return numberTry;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        score++;
    }

    public void clear() {
        Arrays.fill(numbers, 0, numberTry, 0);
        numberTry = 0;
    }

    public void clearScore() {
        score = 0;
    }
}