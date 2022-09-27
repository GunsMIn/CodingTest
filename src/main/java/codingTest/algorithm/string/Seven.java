package codingTest.algorithm.string;

import java.util.Scanner;

public class Seven {


    public String solution1(String str) {
        String answer = "";
        int lt = 0;
        int rt = str.length() - 1;
        char[] c = str.toCharArray(); // 문자열을 문자배열로
        while (lt < rt) { //lt가 rt보다 같거나 커지면 뒤집는 의미가없다.
            if (!Character.isAlphabetic(c[lt])) { // 양쪽에서 비교
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) { // 양쪽에서 비교
                rt++;
            } else { // 2개 다 알파벳일때
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public String solution(String strValue) {

        String answer = "";
        int lt = 0;
        int rt = strValue.length() - 1;
        char[] c = strValue.toCharArray();
        if (!Character.isAlphabetic(c[lt])) {
            lt++;
        } else if (!Character.isAlphabetic(c[rt])) {
            rt--;
        }else{
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
        System.out.println(t.solution1(str));
        System.out.println();

    }


}
