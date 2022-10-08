package codingTest.algorithm.Twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class Five {

    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < n/2+1 ; i++) {
            sum += a[i];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= a[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Five five = new Five();

        int n = sc.nextInt();

        System.out.println(five.solution(n));
    }
}
