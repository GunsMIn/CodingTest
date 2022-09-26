package codingTest.algorithm.string;

import java.util.Scanner;

public class Three {
    /*public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        //띄어쓰기로 분리  문장을 문자열 배열로
        String[] s = str.split(" "); // 띄어쓰기를 바탕으로 문장을 단어로

        for (String x : s) {
            int len = x.length();
            if(len>m){
                m=len;
                answer = x;
            }

        }

        return answer;
    }*/

    public String solution(String str) {
        String[] s = str.split(" ");
        String answer = "";
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (String s1 : s) {
            if (s1.length() > max) {
                answer = s1;
                tmp = s.length;
                max = tmp;
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
