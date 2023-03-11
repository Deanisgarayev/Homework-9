import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int monthSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            monthSpending = monthSpending + current;
        }
        System.out.println("Сумма трат за месяц составила " + monthSpending + " рублей");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > maxArr) {
                maxArr = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей");
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < minArr) {
                minArr = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей");

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int monthSpending = 0;
        int middleSpending = 0;
        int day = 30;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            monthSpending = monthSpending + current;
            middleSpending = monthSpending / day;
        }
        System.out.println("Средняя сумма трат за месяц составила " + middleSpending + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i != 0) {
            }
        }
        System.out.println();
    }
}