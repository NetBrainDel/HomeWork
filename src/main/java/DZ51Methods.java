import java.util.Scanner;

public class DZ51Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сколько будете вводить цифр: ");
        int num1 = scanner.nextInt();
        int[] ar_num = new int[num1];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < num1; i++) {
            ar_num[i] = scanner.nextInt();
        }

        InvDigits(ar_num);

    }

    static void InvDigits(int[] K) {
        for (int i = K.length - 1; i >= 0; i--) {
            System.out.print("|" + K[i] + "|");
        }
    }
}
