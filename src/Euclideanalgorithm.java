import java.util.Scanner;

public class Euclideanalgorithm {
    public static void main(String[] args) {
        int a, b, big, small, mok, nmg;
        int gcm = 0;
        int lcm = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a >= b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        while (true) {
            mok = big / small;
            nmg = big - small * mok;
            if (nmg == 0) {
                gcm = small;
                lcm = a * b / gcm;
                break;
            } else {
                big = small;
                small = nmg;
            }
        }
        System.out.println("최대 공약수" + gcm +
                "\n최소공배수" + lcm);
    }
}
