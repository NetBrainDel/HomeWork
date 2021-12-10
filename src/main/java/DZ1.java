import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите любое число:");
        int number = scanner.nextInt();
        if (number < 10 && number > -1) {
            System.out.println("вы ввели число с одной цифрой и оно положительное:  " + number);
        } else if (number < 100 && number > 9) {
            System.out.println("число двухзначное: " + number);
        } else if (number < 1000 && number > 99) {
            System.out.println("число трехзначное: " + number);
        } else if (number < 10000 && number > 999) {
            System.out.println("число содержит более 3 цифр: " + number);
        } else {
            System.out.println(" число отрицательное: " + number);
        }
    }

}
