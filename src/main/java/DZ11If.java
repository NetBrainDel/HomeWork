public class DZ11If {
    public static void main(String[] args) {
        int A = 2;
        int B = 2;
        if (A != B) {
            if (A > B) {
                B = A;
            } else {
                A = B;
            }
        } else {
            A = 0;
            B = 0;
        }
        System.out.println("A=" + A + " " + "B=" + B);
    }
}
