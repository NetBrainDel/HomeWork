public class DZ8If {
    public static void main(String[] args) {
        int a = 0;
        if (a > 0) {
            a += 1;
        } else if (a < 0) {
            a -= 2;
        } else if (a == 0) {
            a = 10;
        }
        System.out.println(a);
    }
}
