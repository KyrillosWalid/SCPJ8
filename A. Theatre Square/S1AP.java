import java.util.Scanner;
public class S1AP {
    public static void main(String[] args) {
    /*
   **********************************************************
   * THIS CODE BY KYRILLOSWALIDRADI                         *
   * ALL COPYRIGHYS ARE SAVED TO KYRILLOSWALIDRADI          *
   * + 2 0 1 0 6 2 7 0 4 4 1 3 - + 2 0 1 2 1 1 2 8 0 3 5 8  *
   * KYRILLOSWALIDRADI@HOTMAIL.COM                          *
   * WWW.FACEBOOK.COM/KyrillosWalid                         *
   * WWW.GITHUB.COM/KyrillosWalid                           *
   **********************************************************
   */
        Scanner input = new Scanner(System.in);
        long m = input.nextLong();
        long n = input.nextLong();
        long a = input.nextLong();
        long x = m / a;
        long y = n / a;
        if (m % a != 0) {
            x = x + 1;
        }
        if (n % a != 0) {
            y = y + 1;
        }
        long fs = x * y;
        System.out.print(fs);

    }

}
