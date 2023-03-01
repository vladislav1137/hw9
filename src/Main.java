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

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum =0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];}
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = 199_999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ min + " рублей");

        int max =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+ max + " рублей");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0 ;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        sum = sum / arr.length;
        System.out.println(sum);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i < reverseFullName.length && i!= -1; i--) {
            if (i == reverseFullName.length) {
            }
            System.out.print(reverseFullName[i]);
        }

    }
}