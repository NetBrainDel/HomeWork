import java.util.Random;

public class DZ15Switch {
    public static void main(String[] args) {
        Random random = new Random();
        int A = random.nextInt(8);

        switch (A) {
            case (1):
                System.out.println("понедельник");
                break;
            case (2):
                System.out.println("вторник");
                break;
            case (3):
                System.out.println("среда");
                break;
            case (4):
                System.out.println("четверг");
                break;
            case (5):
                System.out.println("пятница");
                break;
            case (6):
                System.out.println("суббота");
                break;
            case (7):
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("чет не то");

        }
    }
}
