import java.util.Arrays;

public class DZ30Array {
    public static void main(String[] args) {


        int[] N = new int[]{1, 2, 2, 5, 4};

        int[] K = new int[5];

        for (int a : N) {
            Arrays.sort(N);
            System.out.print("|" + a + "|");
        }
        System.out.println("");
        for (int i = 0; i < N.length; i++) {
            if (N[i] != i) {
                K[i] += N[i];
                System.out.print("|" + N[i] + "|");
            } else {
                System.out.println("");
                System.out.println("-ТУТ Удален повторяющийся элемент: " + "|" + i + "|");

            }

        }
        System.out.println();

        System.out.println(Arrays.toString(Arrays.stream(K).toArray()));

    }
}