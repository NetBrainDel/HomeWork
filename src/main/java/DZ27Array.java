public class DZ27Array {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int q = 0; q < 1; q++) {
            for (int a = 1; a < array.length; a++) {
                array[q] *= array[a];
            }
            System.out.println(array[q] + "-произведение");
        }
    }
}
