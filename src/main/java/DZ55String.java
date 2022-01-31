import java.util.Scanner;

public class DZ55String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();

        System.out.println(revers(str1));
    }
    public static String revers(String str2) {
        String result = "";
        for (int i = 0; i < str2.length(); i++) {
            result = str2.charAt(i) + result;
        }
        return result;
    }
}
