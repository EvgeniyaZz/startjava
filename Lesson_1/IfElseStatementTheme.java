public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        int age = 18;
        if(age > 20) {
            System.out.println("Возраст более 20 лет");
        } else {
            System.out.println("Возраст до 20 лет");
        }

        boolean isMail = false;
        if(!isMail) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }

        float height = 1.73f;
        if(height < 1.80) {
            System.out.println("Рост менее 1.80 см");
        } else {
            System.out.println("Рост от 1.80 см");
        }

        String capitalLetter = "N";
        if(capitalLetter == "M") {
            System.out.println("имя начинается на букву M");
        } else if(capitalLetter == "I") {
            System.out.println("имя начинается на букву I");
        } else {
            System.out.println("имя начинается на букву " + capitalLetter);
        }

        System.out.println("\n2. Поиск max и min числа");

        int num1 = 5;
        int num2 = 8;

        if(num1 > num2) {
            System.out.println("min: " + num2 + ", max: " + num1);
        } else if(num1 < num2) {
            System.out.println("min: " + num1 + ", max: " + num2);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");

        int num = -55;

        if(num == 0) {
            System.out.println("число " + num +":\nявляется нулем");
        } else {
            if(num % 2 == 0) {
                if(num > 0) {
                    System.out.println("число " + num + ":\nчетное\nположительное");
                } else {
                    System.out.println("число " + num +":\nчетное\nотрицательное");
                }
            } else {
                if(num > 0) {
                    System.out.println("число " + num +":\nнечетное\nположительное");
                } else {
                    System.out.println("число " + num +":\nнечетное\nотрицательное");
                }
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        num1 = 138;
        num2 = 148;
        int num1Position1 = num1 % 10;
        int num1Position2 = num1 % 100 / 10;
        int num1Position3 = num1 / 100;
        int num2Position1 = num2 % 10;
        int num2Position2 = num2 % 100 / 10;
        int num2Position3 = num2 / 100;

        System.out.println("исходные числа: " + num1 + " и " + num2 + "\nОдинаковые цифры: ");

        if(num1Position1 != num2Position1 && num1Position2 != num2Position2 &&
                num1Position3 != num2Position3) {
            System.out.println("Одинаковых цифр нет");
        } else {
            if (num1Position3 == num2Position3) {
                System.out.println("Разряд 3: " + num1 / 100);
            }
            if (num1Position2 == num2Position2) {
                System.out.println("Разряд 2: " + num1 % 100 / 10);
            }
            if (num1Position1 == num2Position1) {
                System.out.println("Разряд 1: " + num1 % 10);
            }
        }

        System.out.println("\n5. Определение символа по его коду");

        char symbol = '\u0057';

        if((int) symbol >= '0' && (int) symbol <= '9') {
            System.out.println("Символ \"" + symbol + "\" - число");
        } else if((int) symbol >= 'a' && (int) symbol <= 'z') {
            System.out.println("Символ \"" + symbol + "\" - маленькая буква");
        } else if((int) symbol >= 'A' && (int) symbol <= 'Z') {
            System.out.println("Символ \"" + symbol + "\" - большая буква");
        } else {
            System.out.println("Символ \"" + symbol + "\" - не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int sum = 300000;
        int percent = 0;

        if(sum < 100000) {
            percent = sum / 100 * 5;
        } else if((sum >= 100000) && (sum <= 300000)) {
            percent = sum / 100 * 7;
        } else if(sum > 300000) {
            percent = sum / 100 * 10;
        }
        int total = sum + percent;
        System.out.println("Сумма вклада: " + sum + "\nНачисленный процент: " + percent +
                "\nитоговая сумма: " + total);

        System.out.println("\n7. Определение оценки по предметам");

        int history = 59;
        int programming = 91;
        int gradeHistory = 0;
        int gradeProgramming = 0;

        if(history <= 60) {
            gradeHistory = 2;
        } else if(history > 60 && history <= 73) {
            gradeHistory = 3;
        } else if(history > 73 && history <= 91) {
            gradeHistory = 4;
        } else if(history > 91) {
            gradeHistory = 5;
        }
        if(programming <= 60) {
            gradeProgramming = 2;
        } else if(programming > 60 && programming <= 73) {
            gradeProgramming = 3;
        } else if(programming > 73 && programming <= 91) {
            gradeProgramming = 4;
        } else if(programming > 91) {
            gradeProgramming = 5;
        }
        System.out.println(gradeHistory + " - история");
        System.out.println(gradeProgramming + " - программирование");
        System.out.println("Средний балл оценок по предметам: " +
                (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний % по предметам: " + (history + programming) / 2);

        System.out.println("\n8. Расчет прибыли за год");
        
        int rent = 5000;
        int payment = 9000;
        int profit = 13000;
        int totalProfit = profit - payment - rent;

        if(totalProfit > 0) {
            System.out.println("Прибыль за год: +" + totalProfit + " руб.");
        } else if(totalProfit < 0) {
            System.out.println("Прибыль за год: " + totalProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + totalProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");

        sum = 567;
        int banknote1 = 1;
        int banknote2 = 10;
        int banknote3 = 100;
        int qualityBanknote1 = 50;
        int qualityBanknote2 = 5;
        int qualityBanknote3 = 10;
        int totalQuality1 = 0;
        int totalQuality2 = 0;
        int totalQuality3 = 0;


        if(((banknote1 * qualityBanknote1) + (banknote2 * qualityBanknote2) +
                (banknote3 * qualityBanknote3)) < sum) {
            System.out.println("В банкомате не достаточно средств");
        } else {
            if(sum % 10 <= qualityBanknote1) {
                totalQuality1 = sum % 10;
            } else {
                System.out.println("Для выдачи запрашиваемой суммы в банкомате не хватает" +
                        " банкнот номиналом 1 USD");
                return;
            }
            if(sum % 100 / 10 <= qualityBanknote2) {
                totalQuality2 = sum % 100 / 10;
            } else {
                totalQuality2 = qualityBanknote2;
                totalQuality1 += (sum % 100 / 10 - qualityBanknote2) * 10;
                if(totalQuality1 > qualityBanknote1) {
                    System.out.println("Для выдачи запрашиваемой суммы в банкомате не хватает" +
                            " банкнот номиналом 1 или 10 USD");
                    return;
                }
            }
            if(sum / 100 <= qualityBanknote3) {
                totalQuality3 = sum / 100;
            } else {
                totalQuality3 = qualityBanknote3;
                totalQuality2 += (sum / 100 - qualityBanknote3) * 10;
                if(totalQuality2 > qualityBanknote2) {
                    totalQuality2 = qualityBanknote2;
                    totalQuality1 += (sum % 100 / 10 - qualityBanknote2) * 10;
                    if(totalQuality1 > qualityBanknote1) {
                        System.out.println("Для выдачи запрашиваемой суммы в банкомате не хватает" +
                                " банкнот номиналом 1, 10 или 100 USD");
                        return;
                    }
                }
            }
            System.out.println("банкноты номиналом 1 USD: " + totalQuality1 + " шт.");
            System.out.println("банкноты номиналом 10 USD: " + totalQuality2 + " шт.");
            System.out.println("банкноты номиналом 100 USD: " + totalQuality3 + " шт.");
            System.out.println("Выдаваемая сумма: " + sum);
        }
    }
}