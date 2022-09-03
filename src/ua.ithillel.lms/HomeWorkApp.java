package ua.ithillel.lms;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        printThreeWords();

        System.out.println("Задача 2");
        checkSumSign();

        System.out.println("Задача 3");
        printColor();

        System.out.println("Задача 4");
        compareNumbers();

        System.out.println("Задача 5");
        System.out.println(isInRange(3, 5));

        System.out.println("Задача 6");
        number(4);

        System.out.println("Задача 7");
        System.out.println(isPositive(2));

        System.out.println("Задача 8");
        printString("tree", 4);

        System.out.println("Задача 9");
        System.out.println(isLeapYear(2204));
    }

    public static void printThreeWords() {
        System.out.println("Orange,\nBanana,\nApple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 3;
        if ((a + b) >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers() {
        int a = 6;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean isInRange(int d, int r) {
        if ((d + r) >= 10 && (d + r) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void number(int s) {
        if (s >= 0) {
            System.out.println(s + " позитивне число");
        } else {
            System.out.println(s + " негативне число");
        }
    }

    public static boolean isPositive(int t) {
        if (t >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printString(String str, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}