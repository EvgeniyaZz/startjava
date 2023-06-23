package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public void play(Player... players) {
        castLots(players);

        final int NUMBER_ROUNDS = 3;
        for(int i = 0; i < NUMBER_ROUNDS; i++) {
            int secretNum = Player.MIN_NUMBER + (int) (Math.random() * Player.MAX_NUMBER);
            System.out.println("Раунд " + (i + 1) + "\nУ каждого игрока по 10 попыток.");

            boolean different = true;
            do {
                for(Player player : players) {
                    enterNumber(player);
                    if(compare(player, secretNum)) {
                        different = false;
                        break;
                    }
                    checkTry(player);
                }
            } while (different && players[0].getNumberTry() != Player.MAX_NUMBER_TRY);

            printTries(players);

            for(Player player : players) {
                player.clear();
            }
        }
        win(players);
    }

    private void castLots(Player[] players) {
        System.out.println("Бросаем жребий:");
        for(int i = 0; i < players.length; i++) {
            int firstPlayer = i + (int) (Math.random() * (players.length - i));
            if(firstPlayer != i) {
                Player player = players[i];
                players[i] = players[firstPlayer];
                players[firstPlayer] = player;
            }
            System.out.println((i + 1) + "й ходит игрок " + players[i].getName());
        }
    }

    private void enterNumber(Player player) {
        Scanner console = new Scanner(System.in);
        do {
            System.out.print(player.getName() + ", введите число: ");
            if(player.addNumber(console.nextInt())) {
                break;
            }
            System.out.println("Ошибка, введенное число должно быть в полуинтервале (0, 100]");
        } while(true);
    }

    private boolean compare(Player player, int secretNum) {
        if(player.getNumber() == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber() + " с " + player.getNumberTry() + " попытки.");
            player.setScore();
            return true;
        }
        System.out.print("число " + player.getNumber());
        System.out.print(player.getNumber() > secretNum ? " больше" : " меньше");
        System.out.println(" того, что загадал компьютер");
        return false;
    }

    private void checkTry(Player player) {
        if(player.getNumberTry() == Player.MAX_NUMBER_TRY) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void printTries(Player[] players) {
        for(Player player : players) {
            System.out.println("Числа которые ввел игрок " + player.getName());
            for(int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void win(Player[] players) {
        for(int i = 0; i < players.length; i++) {
            if(players[i].getScore() > 1) {
                System.out.println("По результатам 3х раундов победил игрок " + players[i].getName());
                break;
            }
            if(i == players.length - 1) {
                System.out.println("По результатам 3х раундов - ничья");
            }
        }
        for(Player player : players) {
            player.clearScore();
        }
    }
}