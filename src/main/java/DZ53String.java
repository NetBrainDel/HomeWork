import java.util.Arrays;
import java.util.Scanner;

public class DZ53String {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int lengArr = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        String[] str1 = new String[lengArr];

        for (int i = 0; i < str1.length; i++) {
            str1[i] = scanner2.nextLine();
        }
        minStr(Arrays.toString(str1));
    }

    static void minStr(String str3) {
        String[] text = str3.split(" ");
        String textMin = text[0];
        for (String str4 : text) {
            if (str4.length() < textMin.length()) {
                textMin = str4;
            }
        }
        System.out.println("Минимальное колличество символов: " + textMin);

    }
}
