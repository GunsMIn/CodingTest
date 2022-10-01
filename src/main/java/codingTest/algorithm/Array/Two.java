package codingTest.algorithm.Array;

import java.util.Scanner;
/*설명

선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
출력
선생님이 볼 수 있는 최대학생수를 출력한다.
예시 입력 1
8
130 135 148 140 145 150 150 153
예시 출력 1
5*/
public class Two {

    public int solution(int n , int[] arr) {

        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i : arr) {
            if (i > max) {
                cnt++;
                max = i;
            }
        }

        return cnt;
    }



    public static void main(String[] args) {
        Two t = new Two();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n, arr));





    }
}
