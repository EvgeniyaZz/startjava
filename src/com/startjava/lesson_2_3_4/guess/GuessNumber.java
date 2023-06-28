package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    static final int QUANTITY_PLAYERS = 3;
    static final int QUANTITY_ROUNDS = 3;

    Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void play() {
        castLots();

        for(int i = 0; i < QUANTITY_ROUNDS; i++) {
            int secretNum = Player.MIN_NUMBER + (int) (Math.random() * Player.MAX_NUMBER);
            System.out.println("Раунд " + (i + 1) + "\nУ каждого игрока - " + Player.MAX_NUMBER_TRY + " попыток.");

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

            printTries();

            for(Player player : players) {
                player.clear();
            }
        }
        checkScore();
    }

    private void castLots() {
        System.out.println("Бросаем жребий:");
        for(int i = 0; i < QUANTITY_PLAYERS; i++) {
            int firstPlayer = i + (int) (Math.random() * (QUANTITY_PLAYERS - i));
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
            player.incrementScore();
            return true;
        }
        System.out.print("число " + player.getNumber());
        System.out.print(player.getNumber() > secretNum ? " больше" : " меньше");
        System.out.println(" того, что загадал компьютер");
        return false;
    }

    private void checkTry(Player player) {
        if(player.getNumberTry() >= Player.MAX_NUMBER_TRY) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void printTries() {
        for(Player player : players) {
            System.out.println("Числа которые ввел игрок " + player.getName());
            for(int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void checkScore() {
        int quantititySameScore = 1;
        for(int i = 0; i < QUANTITY_PLAYERS - 1; i++) {
            if(players[i].getScore() == players[i + 1].getScore()) {
                quantititySameScore++;
            }
        }
        if(quantititySameScore == QUANTITY_PLAYERS) {
            System.out.println("Ничья, победителей нет.");
        } else {
            for (int i = QUANTITY_PLAYERS - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (players[j].getScore() > players[j + 1].getScore()) {
                        Player player = players[j];
                        players[j] = players[j + 1];
                        players[j + 1] = player;
                    }
                }
            }
            System.out.println("Победил игрок: \n" + players[QUANTITY_PLAYERS - 1].getName());
            for (int i = QUANTITY_PLAYERS - 1; i > 0; i--) {
                if (players[i - 1].getScore() == players[i].getScore()) {
                    System.out.println(players[i - 1].getName());
                } else {
                    break;
                }
            }
        }
        for(Player player : players) {
            player.clearScore();
        }
    }
}