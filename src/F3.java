//https://codeforces.com/gym/330766/problem/F
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class F3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[10];
        char[] chars = sc.nextLine().toCharArray();
        for (char c : chars) {
            arr[c-'0']++;
        }

        int k = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                k++;
            }
        }

        if (k > 1) {
            System.out.println(-1);
            System.exit(0);
        }

        int lastdigit = 0;
        for (int i = 1; i < 10; i++) {
            if (arr[i] > 1) {
                arr[i] -= 2;
                System.out.print(i);
                lastdigit = i;
                break;
            }
        }

        if (lastdigit == 0) {
            k = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] == 1) {
                    k++;
                }
            }

            if (k > 1) {
                System.out.println(-1);
                System.exit(0);
            } else {
                for (int i = 0; i < 10; i++) {
                    if (arr[i] == 1) {
                        System.out.println(i);
                        System.exit(0);
                    }
                }
            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr[i]/2; j++) {
                System.out.print(i);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 ==  1) {
                System.out.print(i);
            }
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < arr[i]/2; j++) {
                System.out.print(i);
            }
        }
        System.out.print(lastdigit);
    }
}
