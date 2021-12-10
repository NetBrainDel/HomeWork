import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Вы ввели: " + number);
        System.out.println("Число: ");
        if (number > 0) {
            number += 1;
            System.out.println(" Положительное! Прибавим 1 " + "итог: " + number);
        }
        if (number < 0) {
            number -= 2;
            System.out.println(" Отрицательное! Отнимем 2 " + "итог: " + number);
        }
        if (number == 0) {
            number = 10;
            System.out.println(" Равно нулю! Автозамена на число 10 " + "итог: " + number);
        }
    }
}
