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
    }
}
