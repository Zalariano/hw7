public class Main { public static void main(String[] args) {

    // Задание номер 1
    int salary = 15000;
    int total = 0;
    int m = 0;
    while (total < 2_459_000) {
        total = total + total/100;
        total = total + salary;
        m = m + 1;
        System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей");}

    //Задание номер  2
    int i = 0;
    while (i < 10) {
        i = i + 1;
        System.out.print(i + " ");}
    System.out.println();
    for (i = 10; i >=1; i = i-1) {System.out.print(i + " ");}
    System.out.println();

    //Задание номер 3
    int people = 12_000_000;
    int rody = people/1_000 * 17;
    int smerty = people/1_000 * 8;
    int raznica = rody - smerty;
    for (int g = 1; g <= 10; g = g + 1) {
        people = people + raznica;
        rody = people/1_000 * 17;
        smerty = people/1_000 * 8;
        raznica = rody - smerty;
        System.out.println("Год " + g + ", численность населения составляет" + people );}

    //Задание номер 4
    int vklad = 15000;
    int summa = 0;
    int meciac = 0;
    while (summa < 12_000_000) {
        summa = summa + ((summa/100) * 7);
        summa = summa + vklad;
        meciac = meciac + 1;
        System.out.println("Месяц " + meciac + ", сумма накоплений равна " + summa + " рублей");}

    //Звдвние номер 5
    int vklad1 = 15000;
    int summa1 = 0;
    int meciac1 = -1;
    while (summa1 < 12_000_000) {
        summa1 = summa1 + ((summa1 / 100) * 7);
        summa1 = summa1 + vklad1;
        meciac1 = meciac1 + 1;
        if (meciac1 % 6 == 0) {
            System.out.println("Месяц " + meciac1 + ", сумма накоплений равна " + summa1 + " рублей");}
    }

    //Задание номер 6
    int vklad2 = 15000;
    int summa2 = 0;
    int allTime = 9;
    int allTimeMeciac = allTime * 12;
    for (int m1 = 0; m1 <= allTimeMeciac; m1 = m1 + 1) {
        summa2 = summa2 + ((summa2 / 100) * 7);
        summa2 = summa2 + vklad2;
        if (m1 % 6 == 0) {
            System.out.println("Месяц " + m1 + ", сумма накоплений равна " + summa2 + " рублей");
        }
    }

    //Задание номер 7
    int pervaia = 3;
    System.out.println("Сегодня пятница, " + pervaia+ " -е число. Необходимо подготовить отчет");
    while (pervaia <= 24) {
        pervaia = pervaia + 7;
        System.out.println("Сегодня пятница, " + pervaia+ " -е число. Необходимо подготовить отчет");}

    //Задание номер 8
    int god = 2023;
    for (int years = god - 200 ; years <= god + 100; years++) {
        if (years % 79 == 0) {
            System.out.println(years);}
    }
    }
}