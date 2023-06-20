package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int secretNum = 1 + (int) (Math.random() * 100);
        System.out.println("У каждого игрока по 10 попыток.");

        for(int i = 0; i < 10; i++) {
            enter(player1, i);
            if(compare(player1, secretNum, i)) {
                break;
            }
            endTry(player1);

            enter(player2, i);
            if(compare(player2, secretNum, i)) {
                break;
            }
            endTry(player2);
        }

        System.out.println("Числа которые ввел игрок " + player1.getName());
        show(player1.getNumbers());
        System.out.println("\nЧисла которые ввел игрок " + player2.getName());
        show(player2.getNumbers());
        System.out.println();
        player1.clearNumbers();
        player2.clearNumbers();
    }

    private void enter(Player player, int i) {
        Scanner console = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(i, console.nextInt());
        player.setNumberTry(i + 1);
    }

    private boolean compare(Player player, int secretNum, int i) {
        if(player.getNumber(i) == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber(i) + " с " + player.getNumberTry() + " попытки.");
            return true;
        }
        if(player.getNumber(i) > secretNum) {
            System.out.println("число " + player.getNumber(i) + " больше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println("число " + player.getNumber(i) + " меньше того, " +
                    "что загадал компьютер");
        }
        return false;
    }

    private void endTry(Player player) {
        if(player.getNumberTry() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void show(int[] array) {
        for(int number : array) {
            System.out.print(number + " ");
        }
    }
}