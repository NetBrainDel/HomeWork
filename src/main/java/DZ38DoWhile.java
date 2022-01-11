public class DZ38DoWhile {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 0, 6};
        int n = 0;

        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);

            do {
                n++;
            }
            while (array[i] == 0);

            System.out.println(array[i]);
            System.out.println("Колличество чисел в наборе: " + n);
        }

    }
}



