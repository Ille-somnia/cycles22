public class Main {
    public static void main(String[] args) {
        System.out.println("Homework, cycles22!");

        System.out.println("\nTask 1");

        int desireSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        int month = 0;

        while (sum <= desireSum) {
            sum += amount;
            month++;
            System.out.println("Месяц: " + month + ", сумма накоплений равна " + sum + " рублей.");
        }

        System.out.println("\nTask 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 3");

        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int fertilityTotal = population * fertilityPerThousand / 1000;
        int mortalityTotal = population * mortalityPerThousand / 1000;
        int currentYear = 2025;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += fertilityTotal - mortalityTotal;
            System.out.printf("\nГод %s, численность населения составляет %s", year, population);
        }

        System.out.println("\n\nTask 4");

        desireSum = 12_000_000;
        sum = amount;
        double percent = 7D / 100;
        month = 0;

        while (sum < desireSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц: " + month + ", сумма накоплений равна " + sum + " рублей.");
        }


        System.out.println("\nTask 5");

        desireSum = 12_000_000;
        sum = amount;
        percent = 7D / 100;
        month = 0;

        while (sum < desireSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ", сумма накоплений равна " + sum + " рублей.");
            }
        }

        System.out.println("\nTask 6");

        desireSum = 12_000_000;
        sum = amount;
        percent = 7D / 100;
        month = 0;
        int years = 12 * 9;

        while (month < years) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ", сумма накоплений равна " + sum + " рублей.");
            }
        }

        System.out.println("\nTask 7");

        int numberFriday = 3;
        for (int day = numberFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("\nTask 8");

        int period = 79;
        int yearLast = 2025 - 200;
        int yearFuture = 2025 + 100;
        for (int year = 0; year <= yearFuture; year += period) {
            if (year >= yearLast) {
                System.out.println(year);
            }
        }


    }
}