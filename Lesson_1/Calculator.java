public class Calculator {
    public static void main(String[] args) {

        int a = 12;
        int b = 6;
        char sign = '/';
        int result = 0;

        if(sign == '+') {
            result = a + b;
        } else if(sign == '-') {
            result = a - b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '/') {
            result = a / b;
        } else if(sign == '^') {
            result = a ^ b;
        } else if(sign == '%') {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}