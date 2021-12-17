import java.util.Arrays;
import java.util.Scanner;

public class DZ27Array {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int a =1;

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < array.length; j++) {
                array[i] *= array[j];

                a= array2[j]*a;
            }
            System.out.println(array[i] + "-произведение");

            System.out.println(a);

//            Scanner scanner = new Scanner(System.in);
//            System.out.println("enter ");
//            int[] arrtest = new int[6];
//
//                for (int j = 0; j < arrtest.length; j++) {
//
//                    arrtest[j] = scanner.nextInt();;
//
//                }
//                System.out.println("You array: "+Arrays.toString(Arrays.stream(arrtest).toArray()));

        }
    }
}
