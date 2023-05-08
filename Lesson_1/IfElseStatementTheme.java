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

        int num = 22;

        if(num == 0) {
            System.out.println("число " + num +":\nявляется нулем");
        } else {
            if(num % 2 == 0) {
                System.out.println("число " + num + ":\nчетное");
            } else {
                System.out.println("число " + num +":\nнечетное");
            }
            if(num > 0) {
                System.out.println("положительное");
            } else {
                System.out.println("отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        num1 = 123;
        num2 = 453;
        int onesNum1 = num1 % 10;
        int tensNum1 = num1 % 100 / 10;
        int hundredsNum1 = num1 / 100;
        int onesNum2 = num2 % 10;
        int tensNum2 = num2 % 100 / 10;
        int hundredsNum2 = num2 / 100;
        boolean different = onesNum1 != onesNum2 && tensNum1 != tensNum2 && 
                hundredsNum1 != hundredsNum2;

        System.out.println("исходные числа: " + num1 + " и " + num2 + "\nОдинаковые цифры: ");

        if(different) {
            System.out.println("Одинаковых цифр нет");
        } else {
            if (hundredsNum1 == hundredsNum2) {
                System.out.println("Разряд 3: " + hundredsNum1);
            }
            if (tensNum1 == tensNum2) {
                System.out.println("Разряд 2: " + tensNum1);
            }
            if (onesNum1 == onesNum2) {
                System.out.println("Разряд 1: " + onesNum1);
            }
        }

        System.out.println("\n5. Определение символа по его коду");

        char symbol = '\u0057';

        if(symbol >= '0' && symbol <= '9') {
            System.out.println("Символ \"" + symbol + "\" - число");
        } else if(symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ \"" + symbol + "\" - маленькая буква");
        } else if(symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ \"" + symbol + "\" - большая буква");
        } else {
            System.out.println("Символ \"" + symbol + "\" - не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int sum = 300000;
        int percent = sum / 100 * 5;

        if((sum >= 100000) && (sum <= 300000)) {
            percent = sum / 100 * 7;
        } else if(sum > 300000) {
            percent = sum / 100 * 10;
        }
        int total = sum + percent;
        System.out.println("Сумма вклада: " + sum + "\nНачисленный процент: " + percent +
                "\nитоговая сумма: " + total);

        System.out.println("\n7. Определение оценки по предметам");

        int historyPercent = 59;
        int historyGrade = 0;
        if(historyPercent <= 60) {
            historyGrade = 2;
        } else if(historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if(historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if(historyPercent > 91) {
            historyGrade = 5;
        }

        int programmingPercent = 91;
        int programmingGrade = 0;
        if(programmingPercent <= 60) {
            programmingGrade = 2;
        } else if(programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if(programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if(programmingPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " - история");
        System.out.println(programmingGrade + " - программирование");
        System.out.println("Средний балл оценок по предметам: " +
                (historyGrade + programmingGrade) / 2);
        System.out.println("Средний % по предметам: " + (historyPercent + 
                programmingPercent) / 2);

        System.out.println("\n8. Расчет прибыли за год");
        
        int rent = 5000;
        int payment = 9000;
        int profit = 13000;
        int totalProfit = (profit - payment - rent) * 12;

        if(totalProfit > 0) {
            System.out.println("Прибыль за год: +" + totalProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + totalProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");

        sum = 567;
        int qualityBanknote1 = 50;
        int qualityBanknote10 = 5;
        int qualityBanknote100 = 10;
        boolean large = sum > (qualityBanknote1 + (qualityBanknote10 * 10) +
                (qualityBanknote100 * 100));

        if(large) {
            System.out.println("В банкомате не достаточно средств");
        } else {
            int totalQuality10 = sum % 100 / 10;
            int totalQuality100 = sum / 100;
            if(totalQuality100 > qualityBanknote100) {
                totalQuality10 += (totalQuality100 - qualityBanknote100) * 10;
                totalQuality100 = qualityBanknote100;
            }
            int totalQuality1 = sum % 10;
            if(totalQuality10 > qualityBanknote10) {
                totalQuality1 += (totalQuality10 - qualityBanknote10) * 10;
                totalQuality10 = qualityBanknote10;
            }
            if(totalQuality1 > qualityBanknote1) {
                System.out.println("В банкомате не достаточно средств");
                return;
            }
            System.out.println("банкноты номиналом 1 USD: " + totalQuality1 + " шт.");
            System.out.println("банкноты номиналом 10 USD: " + totalQuality10 + " шт.");
            System.out.println("банкноты номиналом 100 USD: " + totalQuality100 + " шт.");
            System.out.println("Выдаваемая сумма: " + sum);
        }
    }
}