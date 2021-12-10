public class DZ12If {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a < b || a < c) {
            System.out.println(a + " 'a' наименьшее число");
        }
        if (b < a || b > c) {
            System.out.println(b + " 'b' наименьшее число");
        }
        if (c < a || c < b) {
            System.out.println(c + " 'c' наименьшее число");
        }
        if (a > b || a > c) {
            System.out.println(a + " 'a' наибольшее число");
        }
        if (b > a && b > c) {
            System.out.println(b + " 'b' наибольшее число");
        }
        if (c > a && c > b) {
            System.out.println(c + " 'c' наибольшее число");
        }
    }
}
