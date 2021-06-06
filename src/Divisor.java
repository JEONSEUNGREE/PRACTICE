import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        int a, mok, nmg, i;
        int[] b = new int[100];

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        int c = 0;
        int d = -1;

        while (c <= a) {
            c++;
            mok = a / c;
            nmg = a - mok * c;
            if (nmg == 0) {
                    d++;
                    b[d] = c;
            }
        }
        for (i = 0; i < d; i++) {
            System.out.printf("%d\t",b[i]);
        }
    }
}
