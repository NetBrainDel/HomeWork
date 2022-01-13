public class DZ49Methods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(powArray(arr));
    }

    static int powArray(int[] array) {
        int pow = 1;
        for (int i = 0; i < array.length; i++) {
            pow *= array[i];
        }
        return pow;
    }
}
