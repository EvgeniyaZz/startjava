import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner console = new Scanner(System.in);

    public void play() {
        int numberComputer = 1 + (int) (Math.random() * 100);
        do {
            System.out.print(player1.getName() + ", введите число: ");
            player1.setNumber(console.nextInt());
            if(numberComputer < player1.getNumber()) {
                System.out.println("число " + player1.getNumber() + " больше того, " +
                        "что загадал компьютер");
            } else if(numberComputer > player1.getNumber()) {
                System.out.println("число " + player1.getNumber() + " меньше того, " +
                        "что загадал компьютер");
            } else {
                System.out.println(player1.getName() + ", вы угадали!!!");
                break;
            }
            System.out.print(player2.getName() + ", введите число: ");
            player2.setNumber(console.nextInt());
            if(numberComputer < player2.getNumber()) {
                System.out.println("число " + player2.getNumber() + " больше того, " +
                        "что загадал компьютер");
            } else if(numberComputer > player2.getNumber()) {
                System.out.println("число " + player2.getNumber() + " меньше того, " +
                        "что загадал компьютер");
            } else {
                System.out.println(player2.getName() + ", вы угадали!!!");
            }
        } while(numberComputer != player1.getNumber() && numberComputer != player2.getNumber());
    }
}