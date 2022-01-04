import java.util.Scanner;

public class DZ35DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println("N: " + N);

        do {
            N /= 10;
        }
        while ((N > 0) & ((N % 10) % 2 == 0));
        if ((N % 10) % 2 != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
