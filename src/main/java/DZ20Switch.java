import java.util.Random;
/*8. Дано  целое  число,  лежащее  в  диапазоне  1–999.  Вывести  его  строку-
        описание  вида  « четное  двузначное  число»,  «нечетное  трехзначное  число»
        и т. д.*/
public class DZ20Switch {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(1000 - 99);
        System.out.println(r);
        if (r > 99 && r < 200) {
            switch (r) {
                case 100:
                    System.out.println("сто");
            }
        }
    }
}
