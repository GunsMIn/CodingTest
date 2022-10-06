package codingTest.algorithm.BackJoon.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Search1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M ; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch(arr, arr[i]));
        }

    }


    public static int binarySearch(int[] arr, int key) {

        int low = 0; //탐색범위의 왼쪽 끝 인덱스
        int high = arr.length - 1; // 탐색범위의 오른쪽 끝 인덱스

        while (low < high) { // 왼쪽의 기준 숫자가 오른쪽의 숫자보다 작을 때 반복실행

            int mid = (low + high) / 2; // 중간

            //키 값이 중간위치보다 작을경우
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) { // 키 값이 중간 위치보다 클 경우
                low = mid + 1;
            } else { // key값과 중간위치가 값이 같을 경우
                return mid;
            }

        }


        //찾고자 하는 값이 존재하지 않는 경우우
        return -1;


    }
}
