import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int attachment = 15000;
            double total = 0;
            int months = 1;
            double percent = (1 + (1D / 100));
            while (total < 2_459_000) {
                total += attachment;
                total *= percent;
                System.out.printf("Месяц %s сумма накоплений равна %.2f рублей\n", months, total);
                months++;
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 2");
            int i = 1;
            while (i <= 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println("");
            for (int a = 10; a >= 1; a--) {
                System.out.print(a + " ");
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 3");
            int allPeople = 12_000_000;
            int birthPeoplePer1000 = 17;
            int deathPeoplePer1000 = 8;
            for (int year = 1; year <= 10; year++) {
                allPeople += allPeople * birthPeoplePer1000 / 1000 - allPeople * deathPeoplePer1000 / 1000;
                System.out.println("Год " + year +
                        " численность населения составляет " + allPeople);
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 4");
            double total = 15000;
            int month = 1;
            double percent = 1 + (7D / 100);
            while (total < 12_000_000) {
                total *= percent;
                System.out.printf("%s месяц, накоплений уже %.2f\n", month, total);
                month++;
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 5");
            double total = 15000;
            int month = 1;
            double percent = 1 + (7D / 100);
            while (total < 12_000_000) {
                total *= percent;
                month++;
                if (month % 6 == 0) {
                    System.out.printf("Месяц %s сумма накоплений равна %.2f рублей\n", month, total);
                }
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 6");
            double total = 15000;
            int month = 0;
            int sixMonths = 1;
            double percent = 1 + (7D / 100);
            while (month < (12 * 9)) {
                total *= percent;
                month++;
                if (month % 6 == 0) {
                    System.out.printf("%s полугодие, накоплений уже %.2f\n", sixMonths, total);
                    sixMonths++;
                }
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 7");
            int friday = 5;
            while (friday <= 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 8");
            int period = 79;
            int start = 2024 - 200;
            int end = 2024 + 100;
            int startSeeing = 0;
            for (int year = startSeeing; year < end; year += period) {
                if (year > start) {
                    System.out.println(year);
                }
            }
        }
    }
}