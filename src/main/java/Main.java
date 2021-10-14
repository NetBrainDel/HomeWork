import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = 20;
        for (int i = 0; i < 21; i++) {
            System.out.println(" ");
            System.out.println("Enter " + a + " random numbers:");
            --a;
            int num = scanner1.nextInt();

            if (num > 10) {
                if (num == 11 || num == 12 || num == 13 || num == 14) {
                    System.out.println("Your enter: " + num + "**");
                    continue;
                }
                System.out.println("Your enter: " + num + "*");
            } else {
                System.out.println("Your enter: " + num);
            }

        }
        System.out.println(" ");
        System.out.println("Create 2 4-digit passwords");
        Scanner scanner2 = new Scanner(System.in);

        for (int b = 0; b < 20; b++) {
            System.out.print("Main password: ");
            int password1 = scanner2.nextInt();
            System.out.print("Spare password: ");
            int password2 = scanner2.nextInt();

            if (password1 >= 1000 && password1 < 10000
                    && password2 >= 1000 && password2 < 10000) {
                System.out.println("Main password: " + password1);
                System.out.println("Spare password: " + password2);

                System.out.println(" ");
                System.out.println("Now repeat the entered password!");

                Scanner scanner3 = new Scanner(System.in);
                System.out.print("Enter main password: ");
                int password3 = scanner3.nextInt();
                System.out.print("Enter spare password: ");
                int password4 = scanner3.nextInt();

                System.out.println(" ");
                if (password3 == password1) {
                    System.out.println("The main password is correct");
                    System.out.println("Hello");

                    if (password4 == password2) {
                        System.out.println(" ");
                        System.out.println("Hello, change your password");
                        break;
                    }
                } else {
                    System.out.println("Wrong Password, please repeat");
                    System.out.println(" ");
                }
            } else {
                System.out.println("ERROR! You did not enter 4 numbers, please repeat");
                System.out.println(" ");
            }
        }
    }
}

