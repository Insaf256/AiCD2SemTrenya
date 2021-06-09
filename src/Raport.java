//https://silvertests.ru/en/OlympTask.aspx?id=33253

import java.util.Scanner;

public class Raport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int max1 = 0, max2 = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            max1 = Math.max(max1, arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
            max2 = Math.max(max2, arr2[i]);
        }

        max2 = w-max2;

        int answer = w;
        int i = (max1+max2)/2;
        while (max1 <= max2){
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
            answer = Math.min(answer, Math.max(count1, count2));

            if (count1 == count2) {
                System.out.println(count1);
                System.exit(0);
            }
            if (count1 > count2) {
                max1 = i+1;
            } else {
                max2 = i-1;
            }
            i = (max1+max2)/2;
        }
        System.out.println(answer);
    }
}
