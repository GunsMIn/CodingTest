package codingTest.algorithm.Twopointers;

import java.util.Scanner;

public class Three {


    public int solution(int n, int k, int[] a) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        for (int i = k; i < n ; i++) {
            sum += a[i] - a[i - k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }


    public static void main(String[] args) {

        Three t = new Three();
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


    }
}
