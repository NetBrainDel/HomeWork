import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ClassWork {

    static void addColor(String str, ArrayList<String> arrayList) {
        arrayList.add(0,str);
        System.out.println(arrayList);
    }

    static void deleteColor (ArrayList<String>arrayList){
        arrayList.remove(0);
        System.out.println(arrayList);
    }

    static void upDateColor(String str, ArrayList<String>arrayList){
        arrayList.set(0, str);
        System.out.println(arrayList);
    }

    static void rapidCollection(ArrayList<String>arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)+"_"+i);
        }
    }

    static void deleteIndexCollection(ArrayList<String>arrayList){
        arrayList.remove(2);
        System.out.println(arrayList);
    }

    static void sortIndex(ArrayList<String>arrayList, int number){
        System.out.println(arrayList.get(number)+"_");
    }

    static void sortCollection(ArrayList<String>arrayList){
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    static void sortCollections(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println(arrayList+"_________");
    }


    public static void main(String[] args) {

        ArrayList<Integer>arrayList1 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(10);
        arrayList1.add(6);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        arrayList.add("yellow");
        arrayList.add("blue");

        addColor("fire", arrayList );
        deleteColor(arrayList);
        upDateColor("blue", arrayList);
        rapidCollection(arrayList);
        deleteIndexCollection(arrayList);
        sortIndex(arrayList, 0);
        sortCollection(arrayList);
        sortCollections(arrayList1);
                                                          /*Поля
                                                          * конструкторы
                                                          * методы(разные,доп)
                                                          * гед сет*/

            Teacher teacher = new Teacher(60, "Anne");
            Teacher teacher1 = new Teacher(62, "Bill");
            Teacher teacher2 = new Teacher(50, "Jack");
            Teacher teacher3 = new Teacher(50, "Nick");
            LinkedList<Teacher> oldTeachers = new LinkedList<>();
            oldTeachers.add(teacher);
            oldTeachers.add(teacher1);
            oldTeachers.add(teacher2);
            oldTeachers.add(teacher3);
            for (int i = 0; i < oldTeachers.size(); i++) {
                if (oldTeachers.get(i).getAge() >= 60) {
                    System.out.println("Уволен " + oldTeachers.get(i));
                    oldTeachers.remove(i);
                    i = -1;
                }
            }






        /*Collections (add, remove)*/
        /*Queue(Очередь)первый зашел первый вышел*/
        /*Stack последний зашел парвый вышел*/

        /*интерфейс без методов называется МАРКЕРНЫЙ*/
        /*интерфейс с одним методом называется ФУНКЦИОНАЛЬНЫЙ*/


        /*Коллекция*/
        /*Iterable(базовый интерфейс)*/

        /*в нем один метод ИТЕРАТОР()(необходим для перемещения по коллекции)*/

        /*Iterable*/
        /*Коллекция*/

        /*OOP*/

//        ClassWorkOOP classWorkOOP1 = new ClassWorkOOP();
//        ClassWorkOOP classWorkOOP2 = new ClassWorkOOP("farqw", 32, 'M');
//
//        classWorkOOP1.name = "Nik";
//        classWorkOOP1.age = 45;
//        classWorkOOP1.sex = 'm';
//
//        classWorkOOP1.getInfo();
//        System.out.println(" ");


//        classWorkOOP2.name = "#$$#";
//        classWorkOOP2.age = 30;
//        classWorkOOP2.sex = 'F';

//        classWorkOOP2.getInfo();
        /*OOP*/
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

/*
        String string = "Hello World";
        System.out.printf(sim(string));
*/



        /*Main method*/
    }


    /*Методы*/
    /*STRING*/
/*
    static String sim(String revers) {
        String str = "";

        for (int i = 0; i<revers.length(); i++) {
            str = revers.charAt(i)+str;
        }
        return str;
    }
*/

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
