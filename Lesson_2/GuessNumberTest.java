import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(console.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(console.next());
        GuessNumber game = new GuessNumber(player1, player2);

        String repeat;
        do {
            System.out.println("Угадайте число, которое загадал компьютер");
            game.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                repeat = console.next();
            } while((!repeat.equals("yes")) && (!repeat.equals("no")));
        } while(repeat.equals("yes"));
    }
}