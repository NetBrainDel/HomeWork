public class DZ50Methods {
    public static void main(String[] args) {

        int num = 5;
        int step = 5;

        System.out.println(stepPow(num, step));
    }

    static int stepPow(int pow, int step1) {
        return (int) Math.pow(pow, step1);
    }
}
