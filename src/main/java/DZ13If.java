import java.util.Random;

public class DZ13If {
    public static void main(String[] args) {

        Random random = new Random();

        double A = random.nextDouble() * 16 + 2;
        double A1 = 0;
        double B = random.nextDouble() * 5 + 6;
        double B1 = 0;
        double C = random.nextDouble() * 40 + 213;
        double C1 = 0;


        if (A >= B || A >= C) {
            if (A >= C) {
                A1 = C;
            } else {
                A1 = B;
            }

        } else {
            A1 = A;
        }
        System.out.println("Новое значение для 'A' " + A1);

        if (B >= C || B > A1) {
            if (B >= A1) {
                B1 = B;
            } else {
                B1 = C;
            }

        } else {
            B1 = A;
        }
        System.out.println("Новое значение для 'B' " + B1);

        if (C >= A1 || C >= B1) {
            if (C >= B1) {
                C1 = C;
            } else {
                C1 = A;
            }

        } else {
            C1 = C;
        }
        System.out.println("Новое значение для 'C' " + C1);
        System.out.println(" ");

    }
}
