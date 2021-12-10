import java.util.Random;

public class DZ16Switch {
    public static void main(String[] args) {
        Random random = new Random();
        int K = random.nextInt(6);

        switch (K) {
            case (1):
                System.out.println("плохо");
                break;
            case (2):
                System.out.println("неудовлетворительно");
                break;
            case (3):
                System.out.println("удовлетворительно");
                break;
            case (4):
                System.out.println("хорошо");
                break;
            case (5):
                System.out.println("отлично");
                break;

            default:
                System.out.println("ошибка");

        }
    }
}
