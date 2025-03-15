import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1.
        System.out.println("\nЗадача 1.");
        int totalSavings = 0;
        int monthSavings = 15000;
        int monthNumber = 0;
        while (totalSavings < 2_459_000) {
            totalSavings = totalSavings + monthSavings;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + " Сумма накоплений равна "
                    + totalSavings + " рублей");
        }
        // Задача 2.
        System.out.println("\nЗадача 2.");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(" " + number);
        }
        System.out.println(" ");
        for (; number >= 1; number--) {
            System.out.print(" " + number);
        }
        // Задача 3.
        System.out.println("\nЗадача 3.");
        double countryPopulation = 12_000_000;
        int birthRatePerThousand = 17;
        int deathRatePerThousand = 8;
        for (int year = 1; year <= 10; year++) {
            countryPopulation = countryPopulation + Math.floor((countryPopulation / 1000) *
                    (birthRatePerThousand - deathRatePerThousand));
            System.out.printf("Год " + year + ", численность населения составляет "
                    + "%.0f%n", countryPopulation);
        }
        // Задача 4.
        System.out.println("\nЗадача 4.");
        double deposit = 15000;
        int percentPerMonth = 7;
        int month = 0;
        while (deposit < 12_000_000) {
            deposit = deposit + (deposit * percentPerMonth / 100);
            month++;
            System.out.printf(month + " месяц. Сумма накоплений составит " + "%.2f%n", deposit);
        }
        System.out.println("Василий накопит нужную сумму за " + month + " месяцев.");

        //Задача 5.
        System.out.println("\nЗадача 5.");
        deposit = 15000;
        month = 0;
        while (deposit < 12_000_000) {
            deposit = deposit + (deposit * percentPerMonth / 100);
            month++;
            if (month % 6 == 0) {
                System.out.printf(month + " месяц. Сумма накоплений равна " + "%.2f%n", deposit);
            }
        }
        System.out.println("\nВасилий накопит нужную сумму за " + month + " месяцев.");
        System.out.printf("Сумма накоплений составит %.2f%n", deposit);

        // Задача 6.
        System.out.println("\nЗадача 6.");
        deposit = 15000;
        month = 0;
        while (month <= (9 * 12)) {
            month++;
            deposit = deposit + (deposit * percentPerMonth / 100);
            if (month % 6 == 0) {
                System.out.printf(month + " месяц. Сумма накоплений равна " + "%.2f%n", deposit);
            }
        }
        // Задача 7.
        System.out.println("\nЗадача 7.");
        Scanner input = new Scanner(System.in);
        int totalDaysInMonth;
        int firstFriday;
        while (true) {
            System.out.print("\nВведите количество дней в месяце (от 28 до 31) : ");
            totalDaysInMonth = input.nextInt();
            if (totalDaysInMonth >= 28 && totalDaysInMonth <= 31) {
                break;
            } else {
                System.out.println("Вы ввели некорректное число дней, попробуйте ещё раз ");
            }
        }
        while (true) {
            System.out.print("\nВведите число, выпадающее на первую пятницу месяца (от 1 до 7): ");
            firstFriday = input.nextInt();
            if (firstFriday >= 1 && firstFriday <= 7) {
                System.out.println(" ");
                break;
            } else {
                System.out.println("Вы ввели некорректное число дней, попробуйте ещё раз ");
            }
        }
        for (int dayNumber = firstFriday; dayNumber <= totalDaysInMonth; dayNumber = dayNumber + 7) {
            System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчёт");
        }
        // Задача 8.
        System.out.println("\nЗадача 8.");
        System.out.print("\nВведите текущий год : ");
        int currentYear = input.nextInt();
        for (int cometYear = 0; cometYear <= (currentYear + 100); cometYear = cometYear + 79) {
            if (cometYear >= (currentYear - 200)) {
                System.out.println(cometYear);
            }
        }
    }
}