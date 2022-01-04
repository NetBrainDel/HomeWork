import java.util.Arrays;
import java.util.Scanner;

public class DZ37DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int K = 0;
        System.out.println("Введите размер массива!");
        int S = scanner.nextInt();

        System.out.println(" ");


        int[] array = new int[S];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Введите элемент массива №-" + i);
            int N = scanner.nextInt();

            array[i] = N;
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(Arrays.stream(array).toArray()));
        System.out.println(" ");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                K++;
                System.out.print(array[i - 1] + "<" + array[i] + " |");
            }

        }
        System.out.println(" ");
        System.out.println("количество элементов: " + K);

    }
}
