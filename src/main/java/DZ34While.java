import java.util.Scanner;

public class DZ34While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int ost ;
        do {
            ost=N%10;
            N=N/10;

            if (ost==2) {
                System.out.println(true);
                return;
            }
            System.out.println(false);
            return;
        } while (N!=0);

    }
}
