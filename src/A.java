//https://codeforces.com/gym/330766/problem/A
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class A {
    public static Scanner sc;

    public static void main(String[] args) {
        Scanner sc = mock(Scanner.class);
        when(sc.nextInt()).thenReturn(1).thenReturn(1);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[0] += sc.nextInt();
            for (int j = 1; j < n; j++) {
                arr[j] = Math.max(arr[j-1], arr[j]) + sc.nextInt();
            }
        }

        System.out.println(arr[n-1]);
    }
}
