import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            pw.print(binary(arr, k) + " ");
        }
        pw.close();
    }

    private static int binary(int[] arr, int x) {
        int l = 0;
        int r = arr.length-1;
        int i = 0;
        while (l <= r) {
            i = (l+r)/2;
            if (arr[i] == x) break;
            if (arr[i] < x) {
                l = i+1;
            } else {
                r = i-1;
            }
        }
        while (i >= 0 && arr[i] >= x) i--;
        return i+1;
    }

}
