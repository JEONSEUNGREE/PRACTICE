import java.util.Scanner;

public class PrimeNumberCantZero {
    public static void main(String[] args) {
        int a,j;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        j = 2;


        while (a % j != 0) { //a가 나누어지는 값이 자신인지 아닌지로 소수구분
            j++;
            }
        if (a == j) {
            System.out.printf("소수");
        } else {
            System.out.printf("소수아님");
        }

    }
}
