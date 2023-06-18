package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int number;

    private int numberTry = 0;

    private int[] numbersPlayer = new int[10];
    private int[] copyNumbersPlayer;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberPlayer(int index) {
        numbersPlayer[index] = number;
    }

    public void setNumberTry(int numberTry) {
        this.numberTry = numberTry;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberTry() {
        return numberTry;
    }

    public void setCopyNumbersPlayer() {
        copyNumbersPlayer = Arrays.copyOf(numbersPlayer, numberTry);
    }

    public int[] getCopyNumbersPlayer() {
        return copyNumbersPlayer;
    }

    public void clearNumbersPlayer() {
        Arrays.fill(numbersPlayer, 0, numberTry, 0);
    }
}
