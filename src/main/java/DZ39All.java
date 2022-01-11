import java.util.Scanner;

public class DZ39All {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        if (A > 0) {
            System.out.println("Положительное: " + A);
        } else {
            System.out.println("Не положительное: " + A);
        }
    }
}

class DZ40All {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Введите 3-ех значное чило d= ");
        int d = scanner.nextInt();

        if (d > 99 && d < 1000) {

            a = d / 100;
            b = d / 10 % 10;
            c = d % 10;

            if (a == b || a == c || c == b) {
                System.out.println("В числе есть одинаковые цифры");
            } else {
                System.out.println("Все цифры числа разные");
            }
        } else {
            System.out.println("Не 3-ех значное d= " + d);
        }
    }
}

class DZ41All {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n= ");
        int n = in.nextInt();

        double rez = 0;

        for (int i = 1; i <= n; i++) {
            rez += Math.pow(-1, i + 1) * (1.0 + (double) i / 10);
        }
        System.out.print("Result= " + rez);
    }
}

class DZ42All {
    public static void main(String[] args) {

        double N = 7;
        double K = 2;
        int counter = 1;

        double sum = 0.0;
        while (counter <= N)
            sum += Math.pow(counter++, K);
        System.out.println(sum);
    }
}

class DZ43All {
    public static void main(String[] args) {
        int b = 5;

        System.out.println("b= " + b + '\n');
        for (int a = 0; a <= b; a++) {
            System.out.println("a= " + a);
        }
    }
}

class DZ44All {
    public static void main(String[] args) {

    }
}
