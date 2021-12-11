public class DZ28Array {
    public static void main(String[] args) {

        int[] K = {1, 2, 3, 4};
        int[] N = {5, 0, 7, 8};


        for (int i = 0; i < K.length; i++) {
            System.out.print("|" + K[i] + "| ");
        }

        System.out.println("");

        for (int j = 0; j < N.length; j++) {
            System.out.print("|" + N[j] + "| ");

            if (K[j] > N[j]) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }


    }
}
