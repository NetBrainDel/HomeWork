import java.util.Scanner;

public class DZ36DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int K = 0;
        int S = 0;
        System.out.println("Введите целое число N (>1): ");
        int N = scanner.nextInt();
        System.out.println("Вы ввели: " + N);
        while (S <= N) {
            ++K;
            S += K;
        }
        System.out.println("Наименьшее из целых чисел " + K +
                " для которых сумма 1 + 2 + ... + " + K + " будет больше или равна " + N + ":   " +
                "S= " + S);
    }
}

