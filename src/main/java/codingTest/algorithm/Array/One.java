package codingTest.algorithm.Array;

import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)
입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

예시 입력 1

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12*/
public class One {


    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        
        
        return answer;
    }


    public static void main(String[] args) {

        One o = new One();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : o.solution(n, arr)) {
            System.out.println(x + " ");
        }

    }
}
