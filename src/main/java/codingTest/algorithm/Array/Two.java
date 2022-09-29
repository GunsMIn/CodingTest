package codingTest.algorithm.Array;

import java.util.Scanner;

public class Two {


    public int solution(int n, int[] arr) {
        int criteria = arr[0];
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (criteria < arr[i]) {
                cnt++;
                criteria = arr[i];
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
        System.out.println(  t.solution(n, arr));





    }
}
