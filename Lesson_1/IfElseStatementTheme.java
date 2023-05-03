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
        boolean even = num % 2 == 0;

        if(num == 0) {
            System.out.println("число " + num +":\nявляется нулем");
        } else if(num > 0) {
            if(even) {
                System.out.println("число " + num + ":\nчетное\nположительное");
            } else {
                System.out.println("число " + num +":\nнечетное\nположительное");
            }
        } else {
            if(even) {
                System.out.println("число " + num + ":\nчетное\nотрицательное");
            } else {
                System.out.println("число " + num +":\nнечетное\nотрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        num1 = 123;
        num2 = 453;
        int unitNum1 = num1 % 10;
        int tenNum1 = num1 % 100 / 10;
        int hundredNum1 = num1 / 100;
        int unitNum2 = num2 % 10;
        int tenNum2 = num2 % 100 / 10;
        int hundredNum2 = num2 / 100;
        boolean different = unitNum1 != unitNum2 && tenNum1 != tenNum2 && 
                hundredNum1 != hundredNum2;

        System.out.println("исходные числа: " + num1 + " и " + num2 + "\nОдинаковые цифры: ");

        if(different) {
            System.out.println("Одинаковых цифр нет");
        } else {
            if (hundredNum1 == hundredNum2) {
                System.out.println("Разряд 3: " + hundredNum1);
            }
            if (tenNum1 == tenNum2) {
                System.out.println("Разряд 2: " + tenNum1);
            }
            if (unitNum1 == unitNum2) {
                System.out.println("Разряд 1: " + unitNum1);
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

        int historyFinalPercent = 59;
        int historyGrade = 0;
        if(historyFinalPercent <= 60) {
            historyGrade = 2;
        } else if(historyFinalPercent > 60 && historyFinalPercent <= 73) {
            historyGrade = 3;
        } else if(historyFinalPercent > 73 && historyFinalPercent <= 91) {
            historyGrade = 4;
        } else if(historyFinalPercent > 91) {
            historyGrade = 5;
        }

        int programmingFinalPercent = 91;
        int programmingGrade = 0;
        if(programmingFinalPercent <= 60) {
            programmingGrade = 2;
        } else if(programmingFinalPercent > 60 && programmingFinalPercent <= 73) {
            programmingGrade = 3;
        } else if(programmingFinalPercent > 73 && programmingFinalPercent <= 91) {
            programmingGrade = 4;
        } else if(programmingFinalPercent > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " - история");
        System.out.println(programmingGrade + " - программирование");
        System.out.println("Средний балл оценок по предметам: " +
                (historyGrade + programmingGrade) / 2);
        System.out.println("Средний % по предметам: " + (historyFinalPercent + 
                programmingFinalPercent) / 2);

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
        int banknote1 = 1;
        int banknote10 = 10;
        int banknote100 = 100;
        int qualityBanknote1 = 50;
        int qualityBanknote10 = 5;
        int qualityBanknote100 = 10;
        int totalQuality1 = 0;
        int totalQuality10 = 0;
        int totalQuality100 = 0;
        boolean big = ((banknote1 * qualityBanknote1) + (banknote10 * qualityBanknote10) +
                (banknote100 * qualityBanknote100)) < sum;
        int sumBanknote1 = sum % 10;
        int sumBanknote10 = sum % 100 / 10;
        int sumBanknote100 = sum / 100;

        if(big || sumBanknote1 > qualityBanknote1) {
            System.out.println("В банкомате не достаточно средств");
        } else {
            if(sumBanknote1 <= qualityBanknote1) {
                totalQuality1 = sumBanknote1;
            } 
            if(sumBanknote10 <= qualityBanknote10) {
                totalQuality10 = sumBanknote10;
            } else {
                totalQuality10 = qualityBanknote10;
                totalQuality1 += (sumBanknote10 - qualityBanknote10) * 10;
                if(totalQuality1 > qualityBanknote1) {
                    System.out.println("В банкомате не достаточно средств");
                    return;
                }
            }
            if(sumBanknote100 <= qualityBanknote100) {
                totalQuality100 = sumBanknote100;
            } else {
                totalQuality100 = qualityBanknote100;
                totalQuality10 += (sumBanknote100 - qualityBanknote100) * 10;
                if(totalQuality10 > qualityBanknote10) {
                    totalQuality10 = qualityBanknote10;
                    totalQuality1 += (sumBanknote10 - qualityBanknote10) * 10;
                    if(totalQuality1 > qualityBanknote1) {
                        System.out.println("В банкомате не достаточно средств");
                        return;
                    }
                }
            }
            System.out.println("банкноты номиналом 1 USD: " + totalQuality1 + " шт.");
            System.out.println("банкноты номиналом 10 USD: " + totalQuality10 + " шт.");
            System.out.println("банкноты номиналом 100 USD: " + totalQuality100 + " шт.");
            System.out.println("Выдаваемая сумма: " + sum);
        }
    }
}