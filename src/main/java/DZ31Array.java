public class DZ31Array {
    public static void main(String[] args) {
        int N = 13;
        int[] array = new int[]{3, 5, 4, 6, 2, 1, 5, 7, 8, 9, 7, 5, 3};
        int K = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println(array[i] + " Меньше '0'");
                System.out.println("Поменяйте значение");
                return;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i + 1] < array[i]) {
                System.out.print("|" + array[i + 1] + "|");
                K++;
            }
        }
        System.out.println("");
        System.out.println("K = " + K + " -колличество элементов");


    }
}


