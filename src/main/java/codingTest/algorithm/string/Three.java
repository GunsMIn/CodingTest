package codingTest.algorithm.string;

import java.util.Scanner;

public class Three {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        //띄어쓰기로 분리  문장을 문자열 배열로
        String[] s = str.split(" ");

        for (String x : s) {
            int len = x.length();
            if(len>m){
                m=len;
                answer = x;
            }

        }

        return answer;
    }



    public static void main(String[] args) {
        Three t = new Three();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(t.solution(str));
    }
}
