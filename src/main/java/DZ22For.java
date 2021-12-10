public class DZ22For {
    public static void main(String[] args) {
        int A = 2;
        int B = 10;
        int N = 0;

        System.out.println("A = " + A);
        System.out.println("B = " + B);

        for (; A <= B; A++) {

            System.out.print(A + " ");
            N++;
        }
        System.out.println("");
        System.out.println(N + "-колличество цифр");
    }
}
