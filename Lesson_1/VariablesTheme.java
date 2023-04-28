public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        byte quantityCore = 6;
        short ram = 16;
        int maxRam = 32;
        long ssd = 512;
        float frequencyCpu = 3.3f;
        double weight = 1.8;
        char plug = 'C';
        boolean isGame = true;

        System.out.println("Общее количество ядер: " + quantityCore);
        System.out.println("Объем оперативной памяти: " + ram);
        System.out.println("Максимальный объем памяти: " + maxRam);
        System.out.println("SSD: " + ssd);
        System.out.println("Частота процессора: " + frequencyCpu);
        System.out.println("Вес: " + weight);
        System.out.println("Тип вилки: " + plug);
        if(isGame) {
            System.out.println("игровой: Да");
        } else {
            System.out.println("игровой: Нет");
        }

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int costOfPen = 100;
        int costOfBook = 200;
        float discount = 0.11f;
        int sum = costOfPen + costOfBook;
        float discountSum = (float) sum * discount;
        float total = sum - discountSum;

        System.out.println("Общая стоимость товаров без скидки: " + sum);
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой: " + total);

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a    \n   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa     \n JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println(maxByte + "\n" + maxByte++ + "\n" + maxByte--);
        System.out.println("\n" + maxShort + "\n" + maxShort++ + "\n" + maxShort--);
        System.out.println("\n" + maxInt + "\n" + maxInt++ + "\n" + maxInt--);
        System.out.println("\n" + maxLong + "\n" + maxLong++ + "\n" + maxLong--);

        System.out.println("\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;

        System.out.println("с помощью третьей переменной");
        System.out.println("a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("с помощью арифметических операций");
        System.out.println("a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("с помощью побитовой операции ^");
        System.out.println("a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char numberSign = '#';
        char ampersand = '&';
        char atSymbol = '@';
        char circumflex = '^';
        char underscore = '_';

        System.out.println((int) numberSign + " - " + numberSign);
        System.out.println((int) ampersand + " - " + ampersand);
        System.out.println((int) atSymbol + " - " + atSymbol);
        System.out.println((int) circumflex + " - " + circumflex);
        System.out.println((int) underscore + " - " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char forwardSlash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + forwardSlash + backslash);
        System.out.println("   " + forwardSlash + "  " + backslash);
        System.out.println("  " + forwardSlash + underscore + leftParenthesis + " " +
                rightParenthesis + backslash);
        System.out.println(" " + forwardSlash + "      " + backslash);
        System.out.println("" + forwardSlash + underscore + underscore + underscore + underscore +
                forwardSlash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int hundred = num / 100;
        int ten = num / 10 % 10;
        int one = num % 10;
        sum = hundred + ten + one;
        int multiplication = hundred * ten * one;

        System.out.println("Число " + num + " содержит:");
        System.out.println("\t\t" + hundred + " сотен");
        System.out.println("\t\t" + ten + " десятков");
        System.out.println("\t\t" + one + " единиц");
        System.out.println("Сумма его цифр: " + sum);
        System.out.println("Произведение его цифр: " + multiplication);

        System.out.println("\n9. Вывод времени\n");

        int time = 86399;
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 60;

        System.out.println(hour + ":" + minute + ":" + second);
    }
}