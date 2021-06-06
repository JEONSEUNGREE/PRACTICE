import java.util.Scanner;

public class FactorizationInPrimeFactors {
    public static void main(String[] args) {
        int b, c, d, e;
        int mok = 0;
        int nmg = 0;
        int[] a = new int[100];
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

        c = -1;




        while (true) {
            d = 2;
            e = (int)Math.sqrt(b);
            while (true) {
                if (d > e) {
                    d = b;
                }
                mok = b / d;
                nmg = b - mok * d;

                if (nmg == 0) {
                    break;
                } else {
                    d++;
                }
            }
            c++;
            a[c] = d;
            if (b == d) {
               break;
            }
            b = mok;
        }
        for (int i = 0; i <= c; i++) {
            System.out.printf("\n소인수%d",a[i]);
        }


    }
}
