import java.util.Scanner;

public class DZ33While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int A, B;



        System.out.println("A: ");
        A = scanner.nextInt();

        System.out.println("B: ");
        B = scanner.nextInt();
        int n = B;

        if(A > B){
            while (n <= A){
             n += B;
             i++;
            }
            System.out.println("Колличество отрезко B на длинне А: "+i);
        }
    }
}
