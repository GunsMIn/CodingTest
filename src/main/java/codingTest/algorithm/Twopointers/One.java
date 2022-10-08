package codingTest.algorithm.Twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력
오름차순으로 정렬된 배열을 출력합니다.

예시 입력 1
3
1 3 5
5
2 3 6 7 9
예시 출력 1
1 2 3 3 5 6 7 9*/
public class One {

    //풀이1
    public List<Integer> solution(int n,int m,int[] a,int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0; // a배열의 크기까지 ++될 것
        int p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);

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
