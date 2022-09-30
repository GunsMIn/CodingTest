package codingTest.algorithm.Array;

public class Six {


    public int solution(int n, int arr[][]) {

        int answer = Integer.MIN_VALUE;
        int sum1, sum2 ;

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = arr[i][j];
                sum2 = arr[j][i];
            }
            answer = Math.min(answer, sum1);
            answer = Math.min(answer, sum2); // 여기까지 행과 열의 최대값이 answer에 들어감
        }
        //대각선의 최대값을 구하기위해서 다시 2개의 sum을 초기화 진행
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = arr[i][i];
            sum2 = arr[i][n - i - 1];
        }

        answer = Math.min(answer, sum1);
        answer = Math.min(answer, sum2);
        return answer;
    }



}
