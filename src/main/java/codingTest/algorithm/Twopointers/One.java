package codingTest.algorithm.Twopointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {

    //풀이1
    public List<Integer> solution(int n,int m,int[] a,int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0; // a배열의 크기까지 ++될 것
        int p2 = 0;

        while (p1 < n && p2 < m) { // 누군가가 하나가 거짓이됐을것이다.
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]); // 집어넣고 ++ 해준다.
            } else  {
                answer.add(b[p2++]);
            }
        }
        while (p1 < n) {
            answer.add(a[p1++]);
        }
        while (p2 < m) {
            answer.add(b[p2++]);
        }
        return answer;
    }

    //풀이2
    public List<Integer> solution2(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            answer.add(a[p1] < b[p2] ? a[p1++] : b[p2++]);
        } // 여기까지 이렇게 진행시켜주면 차례대로 들어감

        while (p1 < n) {
            answer.add(a[p1++]);
        }
        while (p2 < m) {
            answer.add(b[p2++]);
        }
        return answer;
    }


    public static void main(String[] args) {

        One o = new One();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];//a배열
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];//b배열
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(o.solution2(n,m,a,b));
    }
}
