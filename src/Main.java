public class Main {
    public static void main(String[] args) {
        byte b = 13;
        short s = -2026;
        int i = 13_091984;
        long l = 165_604_365_167L;
        float f = -3.098_4577f;
        double d = 1.309_846_252_785;
        System.out.println("Задача 1:");
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();
        {
            byte b1 = 67;
            short s1 = -159;
            int i1 = 27897;
            long l1 = 987_678_965_549L;
            float f1 = 27.12f;
            double d1 = 2.786;
            System.out.println("Задача 2:");
            System.out.println("Значение переменной b1 с типом byte равно " + b1);
            System.out.println("Значение переменной s1 с типом short равно " + s1);
            System.out.println("Значение переменной i1 с типом int равно " + i1);
            System.out.println("Значение переменной l1 с типом long равно " + l1);
            System.out.println("Значение переменной f1 с типом float равно " + f1);
            System.out.println("Значение переменной d1 с типом double равно " + d1);
            System.out.println();
        }
        {
            byte studentsLudPavl = 23;
            byte studentsAnnaSerg = 27;
            byte studentsEkatAndr = 30;
            short paper = 480;
            short paperForStudent = (short) (paper / (studentsLudPavl + studentsAnnaSerg + studentsEkatAndr));
            System.out.println("Задача 3:");
            System.out.println("На каждого ученика расчитано по " + paperForStudent + " листов бумаги");
            System.out.println();
        }
        {
            byte bottle = 16;
            byte timeMinutes = 2;
            byte efficiencyOneMin = (byte) (bottle / timeMinutes);
            short time20Minutes = (short) (efficiencyOneMin * 20);
            short time24Hours = (short) (time20Minutes * 3);
            short time3Day = (short) (time24Hours * 3);
            int timeOneMonth = (time3Day * 10);//Меняем тип данных на случай если
            // производство усовершенствуют и производительность машины увеличится
            System.out.println("Задача 4:");
            System.out.println("За 20 минут машина произвела " + time20Minutes + " штук бутылок");
            System.out.println("За 24 часа машина произвела " + time24Hours + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + time3Day + " штук бутылок");
            System.out.println("За 1 месяц машина произвела " + timeOneMonth + " штук бутылок");
            System.out.println();
        }
        {
            double painWhite = 2.0; // Берём тип с плвающей запятой на случай если колличество банок
            // получится не целое
            double painBrown = 4.0;
            byte paintEverything = 120;
            byte totalClasses = (byte) (paintEverything / (painWhite + painBrown));
            float painWhiteTotal = (float) (totalClasses / painWhite);
            float painBrownTotal = (float) (totalClasses / painBrown);
            System.out.println("Задача 5:");
            System.out.println("В школе, где  " + totalClasses + " классов, нужно " + painWhiteTotal +
                    " банок белой краски \nи " + painBrownTotal + " банок коричневой краски");
            System.out.println();
        }
        {
            byte bananasTotal = 5;
            byte bananasOneGr = 80;
            short milkTotal = 200;
            short milkOne = (short) ((milkTotal / 100.0) * 105.0);
            byte iceCreamTotal = 2;
            byte iceCreamOneGr = 100;
            byte eggTotal = 4;
            byte eggOneGr = 70;
            int weightGr = (bananasTotal * bananasOneGr) + milkOne + (iceCreamTotal * iceCreamOneGr)
                    + (eggTotal * eggOneGr);
            int grPerKg = 1000;
            float weightKg = weightGr / (float) grPerKg;
            System.out.println("Задача 6:");
            System.out.println("Вес спортзавтрака в граммах:  " + weightGr + " гр.");
            System.out.println("Вес спортзавтрака в килограммах:  " + weightKg + " кг.");
            System.out.println();
        }
        {
            short throwOffKg = 7;
            short throwOffGrDay1 = 250;
            short throwOffGrDay2 = 500;
            short grPerKg = 1000;
            double throwOffGr = throwOffKg * grPerKg;

            short DayThrowOffGr250 = (short) (throwOffGr / throwOffGrDay1);
            short DayThrowOffGr500 = (short) (throwOffGr / throwOffGrDay2);

            System.out.println("Задача 7:");
            System.out.println("Если терять каждый день по 250 гр. " + "спортсмен похудеет за:  \n "
                    + DayThrowOffGr250 + " дней.");
            System.out.println();
            System.out.println("Если терять каждый день по 500 гр. " + "спортсмен похудеет за:  \n"
                    + DayThrowOffGr500 + " дней.");
            System.out.println();
        }
    }
}
