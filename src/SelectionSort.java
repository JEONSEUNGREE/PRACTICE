import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int m, i, j, k, x;
        int data[] = new int[10];
        Scanner sc = new Scanner(System.in);

        m = -1;

        do {
            m++;
            data[m] = sc.nextInt();
        } while (m < 9);

        i = -1;

        do {
            i++;
            j = i;
            do {
                j++;
                if (data[i] > data[j]) {
                    k = data[i];
                    data[i] = data[k];
                    data[j] = k;
                }

            } while (j < 9);
        } while (i < 8);

        for (x = 0; x <= 9; x++) {
        System.out.printf("%d", data[x]);
        }

    }
}
