public class Main {
    public static void main(String[] args) {

        // Задание номер 1
        int salary = 15000;
        int total = 0;
        int month = 0;
        int itog = 2459000;
        while (total < itog) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        //Задание номер  2
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание номер 3
        int people = 12_000_000;
        int rodyNaTysiaczy = 17;
        int smertyNaTysiaczy = 8;
        for (int god = 1; god <= 10; god = god + 1) {
            int rody = people / 1_000 * rodyNaTysiaczy;
            int smerty = people / 1_000 * smertyNaTysiaczy;
            int raznica = rody - smerty;
            people = people + raznica;
            System.out.println("Год " + god + ", численность населения составляет" + people);
        }

        //Задание номер 4
        int vklad = 15000;
        int meciac = 0;
        int procent = 7;
        int itog1 = 12000000;
        while (vklad < itog1) {
            vklad = vklad + (vklad / 100 * procent);
            meciac = meciac + 1;
            System.out.println("Месяц " + meciac + ", сумма накоплений равна " + vklad + " рублей");
        }

        //Звдвние номер 5
        int vklad1 = 15000;
        int meciac1 = -1;
        int konecznajaSumma = 12000000;
        while (vklad1 < konecznajaSumma) {
            vklad1 = vklad1 + (vklad1 / 100 * procent);
            meciac1 = meciac1 + 1;
            if (meciac1 % 6 == 0) {
                System.out.println("Месяц " + meciac1 + ", сумма накоплений равна " + vklad1 + " рублей");
            }
        }

        //Задание номер 6
        int vklad2 = 15000;
        int allTime = 9;
        int allTimeMeciac = allTime * 12;
        for (int month1 = 0; month1 <= allTimeMeciac; month1 = month1 + 1) {
            vklad2 = vklad2 + ((vklad2 / 100) * procent);
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + vklad2 + " рублей");
            }
        }

        //Задание номер 7
        int pervaia = 2;
        int dneyVMecyace = 31;
        while (pervaia <= dneyVMecyace) {
            System.out.println("Сегодня пятница, " + pervaia + " -е число. Необходимо подготовить отчет");
            pervaia = pervaia + 7;

        }

        //Задание номер 8
        int god = 2023;
        for (int years = god - 200; years <= god + 100; years++) {
            if (years % 79 == 0) {
                System.out.println(years);
            }
        }
    }
}