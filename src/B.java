//https://codeforces.com/gym/330766/problem/B
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[5];
        if (n > 4) {
            arr = new int[n + 1];
        }
        arr[1] = 1 % m;
        arr[2] = 1 % m;
        arr[3] = 2 % m;
        arr[4] = 4 % m;
        for (int i = 5; i <= n; i++) {
            arr[i] = (2 * arr[i - 1] - arr[i - 5] + m) % m;
        }
        System.out.println(arr[n]);
    }
}
