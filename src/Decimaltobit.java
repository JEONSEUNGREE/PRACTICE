import java.util.Scanner;

public class Decimaltobit {
    public static void main(String[] args) {
        int b, bb, c;
        int mok = 0;
        int nmg = 0;
        int[] a = new int[10]; //1000이하만 1024
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

        c = -1;

        do {

            c++;
            mok = b / 2;
            nmg = b - mok * 2;
            a[c] = nmg;
            b = mok;

        } while (mok != 0);

        for (int i = c; 0 <= i; i--) {
            System.out.print(a[i]);
        }
    }
}
