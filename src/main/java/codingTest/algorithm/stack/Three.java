package codingTest.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Three {

    public int soultion(int[][] board,int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) { //moves배열은 크레인이 도는 배열 따라서 -1을 해줘야 배열을 돈다.
            for (int i = 0; i < board.length; i++) {//
                if (board[i][move - 1] != 0) { //0이 아닐때가 인형이 있을때이다.
                    int tmp = board[i][move - 1];
                    board[i][move - 1]=0;//뽑았으니까 0으로 만들어준다
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }else{ // 같지않다면 stack에 그냥 넣어준다
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }



        return answer;
    }
    public static void main(String[] args) {
        Three t = new Three();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(t.soultion(board,moves));

    }
}
