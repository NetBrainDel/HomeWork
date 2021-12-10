import java.util.Random;

public class DZ14If {
    public static void main(String[] args) {

        Random random = new Random();
        int A = random.nextInt(999 - 1);


        if (A % 2 == 0) {
            if (A > 99) {
                System.out.println("'A' четное трехзначное число " + A);
            } else {
                System.out.println("'A' четное двузначное число " + A);
            }
        } else if (A < 100 && A > 9) {
            System.out.println("'A' нечетное двузначное число " + A);
        } else {
            System.out.println("'A' нечетное трехзначное число " + A);
        }
    }
}
