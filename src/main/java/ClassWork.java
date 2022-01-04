import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
/*
          условие ? если вывполняется : если не выполняется
*/

//        int a = 1;
//
//        int i = a > 0 ? a++ : a--;
//        System.out.println(a);
//        System.out.println(i);

/*
        для каждого примитивного типа данных есть свой ссылочный тип (обертка)=(для приведения типов)
*/

//        Integer i = new Integer("10"+1);
//
//        Integer i1= new Integer(10+1);
//
//        Integer i2 = 2;
//
//        String a = "asdre"+i+i2;
//        String a1 = i2+"tcf";
//
//        System.out.println(i.toString()+a1);
//        System.out.println(i1);
//        System.out.println(a);
//        System.out.println(a1);



        int[] array = {1, 4, 6, 0, 9};

        System.out.println(Arrays.stream(array).min());

        for (int i = 1; i < array.length; i++) {
         //   System.out.println(array[i]);
            if (array[i] < array[i-1]) {
                    System.out.println(array[i]);
            }
        }
    }
}
