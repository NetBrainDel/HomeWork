public class DZ23For {
    public static void main(String[] args) {

        double M = 2.20;
        double M2 = M;

        System.out.println("Цена за 1кг: " + M);
        for (int i = 2; i <= 10; i++) {
            M2 *= M;
            System.out.println("Цена за " + i + "кг " + M2);
        }

    }
}
