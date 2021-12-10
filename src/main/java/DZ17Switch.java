import java.util.Random;

public class DZ17Switch {
    public static void main(String[] args) {
        Random random = new Random();
        int D = random.nextInt(35);
        int M = random.nextInt(14);
        System.out.println(D + " " + M);

        switch (M) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (D == 31) {
                    if (M != 12) {
                        D = 1;
                        M = M + 1;
                        System.out.println(D + " " + M);
                    } else {
                        D -= 1;
                        System.out.println(D + " " + M);
                    }
                } else if (D > 31) {
                    System.out.println("Такой даты нет!");
                } else {
                    if (D == 1) {
                        M -= 1;
                        if (M == 11 || M == 6 || M == 9 || M == 4) {
                            D = 30;
                            System.out.println(D + " " + M);
                            break;
                        }
                        if (M == 1 || M == 3 || M == 5 || M == 7 ||
                                M == 8 || M == 10 || M == 12) {
                            D = 31;
                            System.out.println(D + " " + M);
                        }
                        System.out.println(D + " " + M);
                    } else if (D > 0) {
                        System.out.println(D - 1 + " " + M);
                        break;
                    }
                    System.out.println("ошибка дня");
                    break;
                }
                break;
            case 2:
                if (D == 28) {
                    D = 1;
                    M = M + 1;
                    System.out.println(D + " " + M);
                } else if (D > 28) {
                    System.out.println("Такой даты нет!");
                } else {
                    System.out.println(D - 1 + " " + M);
                }
                break;
            case 4, 6, 9, 11:
                if (D == 30) {
                    D = 1;
                    M = M + 1;
                    System.out.println(D + " " + M);
                } else if (D > 30) {
                    System.out.println("Такой даты нет!");
                } else if (D != 0) {
                    if (M == 4 || M == 6 || M == 9 || M == 11) {
                        D -= 1;
                        System.out.println(D + " " + M);
                        break;
                    }
                    M -= 1;
                    if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10) {
                        D = 31;
                        System.out.println(D + " " + M);
                        break;
                    }
                    System.out.println(D - 1 + " " + M);
                } else {
                    System.out.println("ошибка!введен несуществующий день");
                }
                break;
            default:
                System.out.println("ошибка!введен несуществующий месяц");
        }
    }
}


