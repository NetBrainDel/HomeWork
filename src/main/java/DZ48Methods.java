import java.util.Scanner;

public class DZ48Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sort = scanner.nextInt();
        int[] arr = {1, 2, 7, 4, 5};

        System.out.println(sorting(arr, sort));

    }

    static boolean sorting(int[] array, int i) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i) {
                return true;
            }
        }
        return false;
    }
}

