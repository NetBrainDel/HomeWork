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


//        int[] array = {1, 4, 6, 0, 9};
//
//        System.out.println(Arrays.stream(array).min());
//
//        for (int i = 1; i < array.length; i++) {
//         //   System.out.println(array[i]);
//            if (array[i] < array[i-1]) {
//                    System.out.println(array[i]);
//            }
//        }

        /*1 ведите число 1 2 3 проверка ввода*/
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        switch (n){
//            case 1:
//                System.out.println(1);
//                break;
//
//            case 2:
//                System.out.println(2);
//                break;
//
//            case 3:
//                System.out.println(3);
//                break;
//
//            default:
//                System.out.println("ef");
//        }

        /*2 найти количество отриц и полож числа*/
//        int a = 1;
//        int b = -2;
//        int c = 3;
//        int pol = 0;
//        int otr = 0;
//
//        if (a>0){
//            pol++;
//        }else {
//            otr++;
//        }
//        if (b>0){
//            pol++;
//        }else {
//            otr++;
//        }
//        if (c>0){
//            pol++;
//        }else {
//            otr++;
//        }
//        System.out.println(pol);
//        System.out.println(otr);

        /*3 вывести максимальный и минимальный элемент массива*/
//        int[] arr= {2,3,4,5,6};
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]){
//                max = arr[i];
//            }
//            if (min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);



        /*Методы*/
        /*Методы*/
        /*мадификатор _ тип возвращаемого значения метода _ имя _ (параметры метода){тело метода}*/

//        int a = 4;
//        int b = 5;
//        int result = sum(a, b);
//        System.out.println(sum(a,b));
//        System.out.println(search());
//    }
//
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static int search(){
//        return 100;
//    }

//       int[] array = {1,2,6,4};
//       outArray(array);
//       System.out.println(" ");
//       System.out.println(sumArray(array));

//        vaTest(1);                     // 1 аргумент
//        vaTest(1, 2, 3);               // 3 аргумента
//        vaTest(5,6,7,8,9,0,0);         // без аргументов
        /*Методы*/


        /*STRING*/
/*        String string = "habfahb jvnjfnvjfnv ojeqfoenvjnfevejan kljbkb jjnkjn";
        System.out.println(minElement(string));
        System.out.println(maxElement(string));*/
        /*STRING*/
        /*Методы*/



        /*Main method*/
    }


    /*Методы*/
    /*STRING*/
/*    static String minElement(String inputString) {
        String[] words = inputString.split(" ");
        String wordMin = words[0];
        for (String str : words) {
            if (str.length() < wordMin.length()){
                wordMin = str;
            }
        }
        return wordMin;
    }

    static String maxElement(String inputString) {
        String[] words = inputString.split(" ");
        String wordMax = words[0];
        for (String str : words) {
            if (str.length() > wordMax.length()){
                wordMax = str;
            }
        }
        return wordMax;
    }*/
    /*STRING*/



    /*Методы*/
//    static void vaTest(int ... v) {
//        System.out.println("Число аргументов: " + v.length);
//        System.out.println("Содержимое: ");
//
//        for (int i = 0; i < v.length; i++) {
//            System.out.println(" arg " + i + ": " + v[i]);
//        }
//        System.out.println();
//    }

//
//    static void outArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }
//
//
//    static int sumArray(int[] array){
//        int sum= 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return sum;
//    }
    /*Методы*/
    /*Методы*/

    /*Class*/
}
