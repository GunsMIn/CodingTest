package codingTest.algorithm.string;

import java.util.Scanner;

public class Seven {


    public String solution(String str) {
        String answer ="";
        int lt = 0;
        int rt = str.length() - 1;
        char[] c = str.toCharArray();

        if (!Character.isAlphabetic(c[lt])) {
            lt++;
        }
        else if (!Character.isAlphabetic(c[rt])) {
            rt++;
        }else{ // 2개 다 알파벳일때
            char tmp = c[lt];
            c[lt] = c[rt];
            c[rt] = tmp;
            lt++;
            rt--;
            answer = String.valueOf(c);
        }
        return answer;

    }


    public static void main(String[] args) {

        Seven t = new Seven();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
        System.out.println();

    }


}
