import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a, b;
        boolean register = false;
        do {
            System.out.print("1. sayiyi giriniz : ");
            a = inp.nextInt();
            System.out.print("2. sayiyi giriniz : ");
            b = inp.nextInt();
            if (a <= 0 || b <= 0) {
                System.out.println("Pozitif Sayilar Giriniz.");
            } else {
                register = true;
            }
        } while (!register);
        if (b < a) {
            int tempN2 = b;
            b = a;
            a = tempN2;
        }
        int i = a;
        while (i >= 1) {
            if ((a % i == 0) && (b % i == 0)) {
                System.out.println("ebob : " + i);
                break;
            } else {
                i--;
            }
        }
        int j = b;
        while (j <= (a * b)) {
            if ((j % a == 0) && (j % b == 0)) {
                System.out.println("ekok : " + j);
                break;
            } else {
                j++;
            }
        }

    }
}
