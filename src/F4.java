//https://codeforces.com/gym/330766/problem/F
import java.io.*;
import java.util.StringTokenizer;

public class F4 {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter pw;

    static String nextToken() {
        try {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(nextToken());
    }

    static long nextLong() {
        return Long.parseLong(nextToken());
    }

    static double nextDouble() {
        return Double.parseDouble(nextToken());
    }

    static String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

    static char nextChar() {
        try {
            return (char) br.read();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void main(String[] args) throws IOException {
//        br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        br = new BufferedReader(new InputStreamReader(System.in));
//        pw = new PrintWriter(new FileWriter("output.txt"));
        pw = new PrintWriter(System.out);
        solve();
        pw.close();
    }

    private static void solve() {
        int n = nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
            arr[nextChar() - '0']++;
        }

        int[] mas = new int[n];
        int id = 0;
        for (int i = 1; i < 10; i++) {
            if (arr[i] > 1) {
                arr[i] -= 2;
                mas[id] = i; mas[n-1] = i;
                id = 1;
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] > 1) {
                for (int j = 0; j < arr[i] / 2; j++) {
                    mas[id] = i; mas[n-1-id] = i;
                    id++;
                }
                arr[i] %= 2;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                mas[id++] = i;
                break;
            }
        }

        if (2 * id < n || n > 1 && mas[0] == 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i++) {
                pw.print(mas[i]);
            }
        }
    }
}