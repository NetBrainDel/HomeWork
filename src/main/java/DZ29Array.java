public class DZ29Array {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        for (int a : array) {
            if (a == 0) {
                System.out.println(a + " -Есть число '0'");
                return;
            }
        }
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n += array[i];
                System.out.print("|" + array[i] + "|");
            }

        }
        System.out.println("-четные числа");

        System.out.println("Их сумма = " + n);


    }
}
