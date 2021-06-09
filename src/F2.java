//https://codeforces.com/gym/330766/problem/F
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class F2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[10];
        char[] chars = sc.nextLine().toCharArray();
        for (char c : chars) {
            arr[c-'0']++;
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

        if (sb.indexOf("0") == 0 && sb.length() > 1) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(sb.toString());
    }
}
