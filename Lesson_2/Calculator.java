public class Calculator {

    private int num1;
    private int num2;
    private char sign;
    private int result = 1;
    private String repeat = "yes";
    private boolean rightSign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
            this.sign = sign;
    }

    public int getResult() {
        return result;
    }

    public boolean getRightSign() {
        return rightSign;
    }

    public int calculate() {
        switch(sign) {
        case '+':
            rightSign = true;
            result = num1 + num2;
            break;
        case '-':
            rightSign = true;
            result = num1 - num2;
            break;
        case '*':
            rightSign = true;
            result = num1 * num2;
            break;
        case '/':
            rightSign = true;
            result = num1 / num2;
            break;
        case '^':
            rightSign = true;
            for(int i = 1; i <= num2; i++) {
            result *= num1;
            }
            break;
        case '%':
            rightSign = true;
            result = num1 % num2;
            break;
        default:
            rightSign = false;
        }
        return result;
    }
}