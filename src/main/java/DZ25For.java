public class DZ25For {
    public static void main(String[] args) {
        int A = 1;
        int B = 5;
        System.out.println("A=" + A);
        int i = 0;

        for (; A <= B; ) {
            A++;
            i++;
            System.out.println(i + "+1" + "=" + A);
            System.out.println(i + "+1");
        }
    }
}
