//https://codeforces.com/gym/330766/problem/C
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+2];
        for (int i = 1; i < n+1; i++) {
            arr[i] = sc.nextInt();
        }
        arr[n+1] = arr[n] + 1;

        int id = 0;
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            while (arr[id+1] <= x) id++;
            System.out.print(id + " ");
        }
    }
}
