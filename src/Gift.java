//https://codeforces.com/contest/1538/problem/G
import java.util.Scanner;

public class Gift {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    private static void solve() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > a) {
            int t = a;
            a = b;
            b = t;
        }
        if (y > x) {
            int t = x;
            x = y;
            y = t;
        }
        int right = Math.min(x/a, y/b);
        int left = 0;
        int answer = 0;
        while (left<=right){
            int i = (right+left)/2;
            int cou = Math.min(i, y/b);
            int x0 = x - a*cou;
            int y0 = y - b*cou;
            cou += Math.min(x0/b, y0/a);
            if (cou > answer) answer = cou;

            if (x0/b > y0/a) {
                left = i+1;
            } else {
                right = i-1;
            }
        }
        System.out.println(answer);
    }
}
