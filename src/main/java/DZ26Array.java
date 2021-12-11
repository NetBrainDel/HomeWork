public class DZ26Array {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            System.out.println(Arrays.toString(Arrays.stream(array).toArray()));

        for (int arr : array) {
            System.out.print("|" + arr + "|" + " ");

        }

        System.out.println('\n');

        for (int j = 0; j < 1; j++) {
            for (int i = 1; i < 10; i++) {
                array[j] += array[i];
            }
            System.out.println(array[j] + "-сумма");
        }


    }

}
