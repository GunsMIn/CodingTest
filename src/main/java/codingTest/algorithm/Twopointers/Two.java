package codingTest.algorithm.Twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Two {

    public List<Integer> solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                p1++;
            } else if (a[p1] > b[p2]) {
                p2++;
            } else {
                answer.add(a[p1++]);
                p2++;
            }
        }
        return answer;

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Two t = new Two();

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
           a[i] =  sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] =  sc.nextInt();
        }
        System.out.println(t.solution(n,m,a,b));

    }
}
