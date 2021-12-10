public class DZ4_DZ5 {
    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int c = 3;
        int p = 0;
        int m = 0;
        if (a > 0) {
            p += 1;
        }
        if (b < 0) {
            m += 1;
        }
        if (c > 0) {
            p += 1;
        }

        System.out.println("в исходном наборе: " + p + " положительных числа");
        System.out.println("в исходном наборе: " + m + " отрицательное число");
    }
}
