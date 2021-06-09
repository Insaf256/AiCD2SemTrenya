//https://codeforces.com/gym/330766/problem/D
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(cou(sc.nextInt(), k));
        }

        System.out.println(set.size());
    }

    public static int cou(int n, int k) {
        int s = 0;
        while (n > 0) {
            s += n%k;
            n /= k;
        }
        return s;
    }
}
