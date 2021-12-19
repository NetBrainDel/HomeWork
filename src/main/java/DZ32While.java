import java.util.Scanner;

public class DZ32While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A,B;
        System.out.println("A: ");
        A = scanner.nextInt();

        System.out.println("B: ");
        B = scanner.nextInt();

        if(A>B) {
            while (A >= 0) {
                A -= B;
            }
            System.out.println(A + B+" -Не занятые части");
        }else {
            System.out.println("Ввели неверные значения!");
        }
    }
}

