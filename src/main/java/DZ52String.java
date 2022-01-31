import java.util.Scanner;

public class DZ52String {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        for (int i = 0; i < minStr(str).length(); i++) {
            n1++;
        }
        System.out.println("Самое короткое слово: |" + minStr(str) + "| с количеством букв: " + n1);
        for (int i = 0; i < maxStr(str).length(); i++) {
            n2++;
        }
        System.out.println("Самое длинное слово: |" + maxStr(str) + "| с количеством букв: " + n2);
    }


    static String minStr(String str) {
        String[] text = str.split(" ");
        String textMin = text[0];
        for (String str1 : text) {
            if (str1.length() < textMin.length()) {
                textMin = str1;
            }
        }
        return textMin;
    }

    static String maxStr(String str) {
        String[] text = str.split(" ");
        String textMax = text[0];
        for (String str1 : text) {
            if (str1.length() > textMax.length()) {
                textMax = str1;
            }
        }
        return textMax;
    }

}
