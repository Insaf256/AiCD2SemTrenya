import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SearchFast {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) {
        solve();
        pw.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int m = sc.nextInt();
        ArrayList<int[]> ans = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            ans.add(new int[]{sc.nextInt(), i});
        }
        ans.sort(Comparator.comparingInt(o -> o[0]));

        int id = 0;
        for (int i = 0; i < m; i++) {
            while (id < n && arr[id] < ans.get(i)[0]) id++;
            ans.get(i)[0] = id;
        }

        ans.sort(Comparator.comparingInt(o -> o[1]));
        for (int i = 0; i < m; i++) {
            pw.print(ans.get(i)[0] + " ");
        }
    }
}
