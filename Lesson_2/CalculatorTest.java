import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String repeat = "yes";
        while(repeat.equals("yes")) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(console.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(console.nextInt());
            calculator.calculate();
            if (!calculator.getRightSign()) {
                System.out.println("Введенная математическая операция не поддерживается.");
            } else {
                System.out.println("Результат: " + calculator.getResult());
            }
            do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            repeat = console.next();
            if(repeat.equals("no")) {
                break;
            }
            } while (!repeat.equals("yes"));
        }
    }
}