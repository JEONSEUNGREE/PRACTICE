import java.util.Scanner;

public class PrimeNumberCanZero {
    public static void main(String[] args) {
        int a, i, j;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        i = a -1; //포인트
        j = 2;

        while (true) {
            if (j <= i) {
                if (a % j == 0) {
                    System.out.printf("소수아님");
                    break;
                } else {
                    j++;
                }
            } else {
                System.out.printf("소수");
                break;
            }
        }

    }
}
