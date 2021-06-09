//https://codeforces.com/gym/330766/problem/F
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.read() - '0';
        in.read();
        int[] arr = new int[10];

        for (int i = 0; i < n; i++) {
            int x = in.read() - '0';
            arr[x]++;

        }

        StringBuilder sb = new StringBuilder();
        int id = 0;
        for (int i = 1; i < 10; i++) {
            if (arr[i] > 1) {
                arr[i] -= 2;
                sb.append(i).append(i);
                id = 1;
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            while (arr[i] > 1) {
                arr[i] -= 2;
                sb.insert(id++, i*10+i);
            }
        }

        boolean flag = false;

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                if (flag) {
                    System.out.println(-1);
                    System.exit(0);
                }
                flag = true;
                sb.insert(id++, i);
            }
        }

        if (sb.indexOf("0") == 0) {
            System.out.println(-1);
            System.exit(0);
        }
        pw.println(sb.toString());
        pw.close();
    }
}
