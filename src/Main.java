import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int attachment = 15000;
            int total = 0;
            int months = 1;
            while (total < 2_459_000) {
                total = total + attachment;
                months++;
            }
            System.out.println("Месяц " + months +
                    " , сумма накоплений равна " + total + " рублей");
        }
        {
            System.out.println("");
            System.out.println("Задача 2");
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
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
            int addedPeople = ((17 - 8) * 12_000);
            for (int year = 1; year <= 10; year++) {
                allPeople = allPeople + addedPeople;
                System.out.println("Год " + year +
                        " численность населения составляет " + allPeople);
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 4");
            int total = 15000;
            int month = 1;
            while (total < 12_000_000) {
                System.out.println(month + " месяц, накоплений уже " + total);
                total = total + ((total / 100) * 7);
                month++;
            }
            System.out.println(month + " месяц, накоплений уже " + total);
        }
        {
            System.out.println("");
            System.out.println("Задача 5");
            int total = 15000;
            int month = 1;
            while (total < 12_000_000) {
                total = total + ((total / 100) * 7);
                month++;
                if (month % 6 == 0) {
                    System.out.println(month + " месяц, накоплений уже " + total);
                }
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 6");
            int total = 15000;
            int month = 1;
            int sixMonths = 1;
            while (month <= 108) {
                total = total + ((total / 100) * 7);
                month++;
                if (month % 6 == 0) {
                    System.out.println(sixMonths + " полугодие, накоплений уже " + total);
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
            int year = 1824;
            while (year >= 1824 && year <= 2124) {
                year++;
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
        }
    }
}