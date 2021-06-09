//https://codeforces.com/gym/330766/problem/E
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        class Pair {
            int a;
            int b;
            public Pair(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }
        Comparator<Pair> comparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.b - o2.b;
            }
        };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        list.sort(comparator);

        int cou = 0;
        while (!list.isEmpty()) {
            int k = list.get(0).b;
            cou++;
            int id = 0;
            while (id < list.size()) {
                if (list.get(id).a <= k) {
                    list.remove(id);
                } else {
                    id++;
                }
            }
        }
        System.out.println(cou);
    }

}
