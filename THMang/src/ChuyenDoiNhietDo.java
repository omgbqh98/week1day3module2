import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        System.out.println("Menu: ");
        System.out.println("1. Chuyen F sang C ");
        System.out.println("2. Chuyen C sang F ");
        System.out.println("0. Exit ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("input select ");
        int select = scanner.nextInt();
        if (select>=0 && select<=2){
            switch (select){
                case 1:
                    System.out.println("input do F: ");
                    double f = scanner.nextDouble();
                    System.out.println(convertFToC(f));
                    break;
                case 2:
                    System.out.println("input do C: ");
                    double c =scanner.nextDouble();
                    System.out.println(convertCToF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        }else {
            System.out.println("ko co trong menu");
        }

    }
    static double convertFToC(double f) {
        double C = (5.0 / 9) * (f - 32);
        return C;
    }
    static double convertCToF(double C) {
        double F = (9.0/5)*C+32;
        return F;
    }

}
