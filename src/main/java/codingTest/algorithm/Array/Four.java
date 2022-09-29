package codingTest.algorithm.Array;

import java.util.Scanner;

public class Four {

    public int solution(int n , int[] arr) {
        int answer = 0;
        int tmp = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else if (arr[i] == 0) {
                cnt = 0;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Four o = new Four();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(o.solution(n, arr));



    }
    }

