import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 стороны для треугольника: ");
        System.out.println("Введите сторону a: ");
        int a = scanner.nextInt();
        System.out.println("Введите сторону b: ");
        int b = scanner.nextInt();
        System.out.println("Введите сторону c: ");
        int c = scanner.nextInt();

        int q = a + b;
        int w = b + c;
        int e = c + a;

        if (a + b > c) {
            System.out.println("Вы создали треугольник, где a+b>c " + "|" + q + " > " + c);
        } else {
            System.out.println("Вы создали нечто, сумма первых 2-ух чисел меньше 3-ей: " + q + "<" + c);
        }
        if (b + c > a) {
            System.out.println("Вы создали треугольник, где c+b>a " + "|" + w + " > " + a);
        } else {
            System.out.println("Вы создали нечто, сумма первых 2-ух чисел меньше 3-ей: " + w + "<" + a);
        }
        if (c + a > b) {
            System.out.println("Вы создали треугольник, где a+c>b " + "|" + e + " > " + b);
        } else {
            System.out.println("Вы создали нечто, сумма первых 2-ух чисел меньше 3-ей: " + e + "<" + b);
        }
    }
}
