//https://codeforces.com/gym/330766/problem/G
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, maxVal = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int x= sc.nextInt();
            cur += x;
            if (i == 0) maxVal = x;
            if (x> maxVal) maxVal = x;
            if (cur < 0) {
                cur = 0;
            } else {
                if (cur > max) {
                    max = cur;
                }
            }
        }
        if (maxVal > 0) System.out.println(max);
        else System.out.println(maxVal);
    }
}
