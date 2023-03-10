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
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > maxArr) {
                maxArr = current;
            }
        }
        System.out.println("Сумма трат за месяц составила " + maxArr + " рублей");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int day = 30;
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > maxArr){
                maxArr = current;
            }
        }
        int maxDayArr = maxArr / day;
        System.out.println("Максимальная сумма трат за день составила " + maxDayArr + " рублей");
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < maxArr) {
                maxArr = current;
            }
        }
        int minDayArr = maxArr / day;
                System.out.println("Минимальная сумма трат за день составила " + minDayArr + " рублей");

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int day = 30;
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > maxArr){
                maxArr = current;
            }
        }
        int maxDayArr = maxArr;
        System.out.println("Максимальная сумма трат за день составила " + maxDayArr + " рублей");
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < maxArr) {
                maxArr = current;
            }
        }
        int minDayArr =maxArr;
        System.out.println("Минимальная сумма трат за день составила " + minDayArr + " рублей");
        int midDayArr = minDayArr + ((maxDayArr- minDayArr) / 2);
        System.out.println("Средняя сумма трат за месяц составила " + midDayArr + " рублей");
    }


    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = new char[] {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
            if (i != 0) {
            }
        }
    }
}