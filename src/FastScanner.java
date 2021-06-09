import java.io.*;
import java.util.StringTokenizer;

public class FastScanner {
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
        int w = nextInt();
        int n = nextInt();
        int m = nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int max1 = 0, max2 = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = nextInt();
            max1 = Math.max(max1, arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = nextInt();
            max2 = Math.max(max2, arr2[i]);
        }

        int answer = 0;
        for (int i = max1; i <= w-max2; i++) {
            int count1 = 1, t = -1;
            for (int j = 0; j < n; j++) {
                if (t + arr1[j] + 1 > i) {
                    t = arr1[j];
                    count1++;
                } else {
                    t += arr1[j] + 1;
                }
            }

            int count2 = 1;
            t = -1;
            for (int j = 0; j < m; j++) {
                if (t + arr2[j] + 1 > w-i) {
                    t = arr2[j];
                    count2++;
                } else {
                    t += arr2[j] + 1;
                }
            }
            if (answer == 0 || answer > Math.max(count1, count2)) {
                answer = Math.max(count1, count2);
            }
        }
        pw.println(answer);
        pw.close();
    }
}