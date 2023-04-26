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
        String answerIsGame;
        if(isGame)
            answerIsGame = "Да";
        else
            answerIsGame = "Нет";

        System.out.println("Общее количество ядер: " + quantityCore);
        System.out.println("Объем оперативной памяти: " + ram);
        System.out.println("Максимальный объем памяти: " + maxRam);
        System.out.println("SSD: " + ssd);
        System.out.println("Частота процессора: " + frequencyCpu);
        System.out.println("Вес: " + weight);
        System.out.println("Тип вилки: " + plug);
        System.out.println("игровой: " + answerIsGame);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int pen = 100;
        int book = 200;
        float sale = 0.11f;
        int summ = pen + book;
        float summSale = (float) summ * sale;
        float total = summ - summSale;

        System.out.println("Общая стоимость товаров без скидки: " + summ);
        System.out.println("Сумма скидки: " + summSale);
        System.out.println("Общая стоимость товаров со скидкой: " + total);

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a    \n   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa     \n JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;


        System.out.println(num1);
        System.out.println(num1++);
        System.out.println(num1--);
        System.out.println("\n" + num2);
        System.out.println(num2++);
        System.out.println(num2--);
        System.out.println("\n" + num3);
        System.out.println(num3++);
        System.out.println(num3--);
        System.out.println("\n" + num4);
        System.out.println(num4++);
        System.out.println(num4--);

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

        char char1 = '#';
        char char2 = '&';
        char char3 = '@';
        char char4 = '^';
        char char5 = '_';

        int numChar1 = (int) char1;
        int numChar2 = (int) char2;
        int numChar3 = (int) char3;
        int numChar4 = (int) char4;
        int numChar5 = (int) char5;
        
        System.out.println(numChar1 + " - " + char1);
        System.out.println(numChar2 + " - " + char2);
        System.out.println(numChar3 + " - " + char3);
        System.out.println(numChar4 + " - " + char4);
        System.out.println(numChar5 + " - " + char5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char1 = '/';
        char2 = '\\';
        char3 = '(';
        char4 = ')';
        char5 = '_';

        System.out.println("    " + char1 + char2);
        System.out.println("   " + char1 + "  " + char2);
        System.out.println("  " + char1 + char5 + char3 + " " + char4 + char2);
        System.out.println(" " + char1 + "      " + char2);
        System.out.println(char1 + "" + char5 + "" + char5 + "" + char5 + "" + char5 +
            "" + char1 + "" + char2 + "" + char5 + "" + char5 + "" + char2);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int hundred = num / 100;
        int ten = num / 10 % 10;
        int one = num % 10;
        int summa = hundred + ten + one;
        int multiplication = hundred * ten * one;

        System.out.println("Число " + num + " содержит:");
        System.out.println("\t\t" + hundred + " сотен");
        System.out.println("\t\t" + ten + " десятков");
        System.out.println("\t\t" + one + " единиц");
        System.out.println("Сумма его цифр: " + summa);
        System.out.println("Произведение его цифр: " + multiplication);

        System.out.println("\n9. Вывод времени\n");

        int time = 86399;
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 60;

        System.out.println(hour + ":" + minute + ":" + second);
    }
}